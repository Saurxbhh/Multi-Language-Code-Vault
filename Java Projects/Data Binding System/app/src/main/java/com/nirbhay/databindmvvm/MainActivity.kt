package com.nirbhay.databindmvvm

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.nirbhay.databindmvvm.adapters.TabsAdapter
import com.nirbhay.databindmvvm.databinding.ActivityMainBinding
import com.nirbhay.databindmvvm.fragments.HomeFragment
import com.nirbhay.databindmvvm.interfaces.CommingLiveCompleteCallback


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("Cricket").setIcon(R.drawable.cricket_1ball)
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("Football").setIcon(R.drawable.soccer_ball_variant)
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("Kabaddi").setIcon(R.drawable.kabaddi)
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("Basketball").setIcon(R.drawable.basketball)
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("Hockey").setIcon(R.drawable.hockey)
        )



        binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = TabsAdapter(
            this, supportFragmentManager,
            binding.tabLayout.tabCount
        )
        binding.viewPager.adapter = adapter
        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        binding.mainmatchestype.setBackgroundResource(R.drawable.radius_corren)
        binding.upcomingbtn.setOnClickListener {
            binding.mainmatchestype.setBackgroundResource(R.drawable.radius_corren)
            binding.upcomingbtn.setBackgroundResource(R.drawable.radius_header_color)
            binding.livebtn.setBackgroundResource(R.drawable.radius_corren_unselected)
            binding.completebtn.setBackgroundResource(R.drawable.radius_corren_unselected)
           Toast.makeText(MainActivity@this,"Hello",Toast.LENGTH_LONG).show()
           // HomeFragment().upcomingMatch()

        }
        binding.livebtn.setOnClickListener {
            binding.upcomingbtn.setBackgroundResource(R.drawable.radius_corren_unselected)
            binding.livebtn.setBackgroundResource(R.drawable.radius_header_color)
            binding.completebtn.setBackgroundResource(R.drawable.radius_corren_unselected)
            binding.mainmatchestype.setBackgroundResource(R.drawable.radius_corren)
           // HomeFragment().Livematch()
        }
        binding.completebtn.setOnClickListener {
            binding.mainmatchestype.setBackgroundResource(R.drawable.radius_corren)
            binding.upcomingbtn.setBackgroundResource(R.drawable.radius_corren_unselected)
            binding.livebtn.setBackgroundResource(R.drawable.radius_corren_unselected)
            binding.completebtn.setBackgroundResource(R.drawable.radius_header_color)
            //HomeFragment().completeMatch()
        }


    }


}