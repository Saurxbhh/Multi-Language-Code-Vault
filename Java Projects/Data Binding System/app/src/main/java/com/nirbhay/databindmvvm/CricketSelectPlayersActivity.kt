package com.nirbhay.databindmvvm

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.tabs.TabLayout
import com.nirbhay.databindmvvm.adapters.PlayerSelectedTabsAdpater
import com.nirbhay.databindmvvm.adapters.TabsAdapter
import com.nirbhay.databindmvvm.databinding.CricketSelectedPlayersActivityBinding

class CricketSelectPlayersActivity : AppCompatActivity() {

    lateinit var binding : CricketSelectedPlayersActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.cricket_selected_players_activity)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("WK(0)")
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("BAT(0)")
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("AR(0)")
        )
        binding.tabLayout.addTab(
            binding.tabLayout.newTab().setText("BOWL(0)")
        )


        binding.nextbtn.setOnClickListener {
            startActivity(Intent(this,MakeTeamFinalActivity::class.java))
        }

        binding.prvbtn.setOnClickListener {
            startActivity(Intent(this, PichActivity::class.java))
        }
        binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = PlayerSelectedTabsAdpater(
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
    }
}