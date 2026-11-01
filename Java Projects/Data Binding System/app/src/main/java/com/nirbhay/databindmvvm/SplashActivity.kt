package com.nirbhay.databindmvvm

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.nirbhay.databindmvvm.adapters.PlayerCustomAdapter
import com.nirbhay.databindmvvm.adapters.PlayerSelectedAdapter
import com.nirbhay.databindmvvm.adapters.TabsAdapter
import com.nirbhay.databindmvvm.databinding.ActivityMainBinding
import com.nirbhay.databindmvvm.databinding.PichActivityBinding
import com.nirbhay.databindmvvm.models.ItemsViewModel


class SplashActivity : AppCompatActivity() {

    //lateinit var binding : Spla

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  binding = DataBindingUtil.setContentView(this, R.layout.pich_activity)



        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }




    }
}