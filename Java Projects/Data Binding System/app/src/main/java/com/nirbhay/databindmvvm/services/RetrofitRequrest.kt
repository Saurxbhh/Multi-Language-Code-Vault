package com.nirbhay.databindmvvm.services

import android.content.SharedPreferences
import android.content.Intent
import android.app.ProgressDialog
import android.content.Context
import com.nirbhay.databindmvvm.utils.ApplicationController
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import com.nirbhay.databindmvvm.services.RetrofitRequrest
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.Interceptor
import kotlin.Throws
import android.text.TextUtils
import com.nirbhay.databindmvvm.utils.PrefUtils
import android.net.ConnectivityManager
import com.nirbhay.databindmvvm.utils.Const
import java.util.HashMap
import java.util.concurrent.TimeUnit

object RetrofitRequrest {
    var editor: SharedPreferences.Editor? = null

    // public static FusedLocationProviderClient mFusedLocationClient;
    private val intentObject: Intent? = null
    private val pdObject: ProgressDialog? = null
    private val publicObject: ApplicationController? = null
    var param: HashMap<String, String>? = null
        get() = if (field == null) {
            HashMap<String, String>().also { field = it }
        } else {
            field
        }
        private set
    private var retrofit: Retrofit? = null
    private const val REQUEST_TIMEOUT = 60
    private var okHttpClient: OkHttpClient? = null
    fun putDataInPREF(cnt: Context?, pref: SharedPreferences): SharedPreferences.Editor? {
        editor = pref.edit()
        return editor
    }

    fun getSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences("APP_PREF", Context.MODE_PRIVATE)
    }

    fun getClient(context: Context): Retrofit? {
        if (okHttpClient == null) initOkHttp(context)
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(Const.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }

    private fun initOkHttp(context: Context) {
        val httpClient = OkHttpClient().newBuilder()
            .connectTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .readTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
            .writeTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        httpClient.addInterceptor(interceptor)
        httpClient.addInterceptor { chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")

            // Adding Authorization token (API Key)
            // Requests will be denied without API key
            if (!TextUtils.isEmpty(PrefUtils.getApiKey(context))) {
                requestBuilder.addHeader("Authorization", PrefUtils.getApiKey(context))
            }
            val request = requestBuilder.build()
            chain.proceed(request)
        }
        okHttpClient = httpClient.build()
    }

    fun ProgressForDriver(cnt: Context?): ProgressDialog? {
        return pdObject ?: ProgressDialog(cnt)
    }

    fun createActivityInstance(cnt: Context?, targetclass: Class<*>?): Intent? {
        return intentObject ?: Intent(cnt, targetclass)
    }

    fun getGlobleOblect(cnt: Context): ApplicationController {
        return cnt.applicationContext as ApplicationController
    }

    fun isNetworkConnected(cnt: Context): Boolean {
        val cm = cnt.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo!!.isConnected
    }
}