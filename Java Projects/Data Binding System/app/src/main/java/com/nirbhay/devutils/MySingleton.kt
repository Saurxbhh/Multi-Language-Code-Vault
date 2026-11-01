package com.nirbhay.devutils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.List as List

/*
 * Developer: Nirbhay
 * Date: 2023-8-07
 * Description: This MySingleton is responsible for single object entire app functionality.
 *
 */
class MySingleton {
    private var retrofit: Retrofit? = null
    companion object {
        @Volatile
        private var instance: MySingleton? = null

        fun getInstance(): MySingleton {

            return instance ?: synchronized(this) {
                instance ?: MySingleton().also { instance = it }
            }
        }
    }



    // Other methods and properties of the Singleton class
    fun hideToolbar(actionBar: ActionBar) {
        actionBar?.hide()
    }

    /*
    *  For Toast Message
    * */
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    /*

   Try catch
     */
    fun <T> tryCatch(block: () -> T): T? {
        return try {
            block()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    /*

    Intent Generic for all
     */
    fun navigateTo(context: Context, destinationActivityClass: Class<*>) {
        val intent = Intent(context, destinationActivityClass)
        context.startActivity(intent)
    }
    /*
    Application object for access any where
     */
    fun ApplicationObj(context: Activity): MyApplication {
        val myApplication = context.application as MyApplication
        return myApplication

    }




    fun fragmentCall(
        supportFragmentManager: FragmentManager,
        layoutId: Int,
        MyFragment: Fragment,
        str: String
    ) {
        supportFragmentManager.beginTransaction().addToBackStack(str)
            .replace(layoutId, MyFragment)
            .commit()
    }

    fun fragmentCallNonBackstack(
        supportFragmentManager: FragmentManager,
        layoutId: Int,
        MyFragment: Fragment
    ) {
        supportFragmentManager.beginTransaction()
            .replace(layoutId, MyFragment)
            .commit()
    }

    fun getTypeOfFeedback(): List<String> {

        val typeoffeedbk = listOf("I'm having an issue")
        return typeoffeedbk
    }

    fun getClaimsType(): List<String> {
        val itemsClaimtyp = listOf("Parking", "Bike")
        return itemsClaimtyp
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentDate(dateString : String):String
    {
        var dateStrSpace = dateString.split(" ")
        var dateStr = dateStrSpace[0].split("-")
        val currentDateTime = LocalDateTime.now()

        // Future date and time (replace this with your desired future date and time)
        val futureDateTime = LocalDateTime.of(dateStr[0].toInt(), dateStr[1].toInt(), dateStr[2].toInt(), dateStrSpace[0].toInt(), dateStrSpace[1].toInt(), 0)

        // Calculate the difference in days
        val daysRemaining = ChronoUnit.DAYS.between(currentDateTime, futureDateTime)

        // Print the result
        println("Current date and time: $currentDateTime")
        println("Future date and time: $futureDateTime")
        println("Days remaining: $daysRemaining")
        return daysRemaining.toString()
    }


}


