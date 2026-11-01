package com.nirbhay.databindmvvm

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.nirbhay.databindmvvm.adapters.MatchContestTabsAdapter
import com.nirbhay.databindmvvm.adapters.TabsAdapter
import com.nirbhay.databindmvvm.databinding.ActivityMainBinding
import com.nirbhay.databindmvvm.databinding.BackWithHeaderBinding
import com.nirbhay.databindmvvm.databinding.MainContestBinding
import com.nirbhay.databindmvvm.utils.SingletonObjectAccess


class MatchContestActivity : AppCompatActivity() {

    lateinit var binding: MainContestBinding
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var headerlay : BackWithHeaderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_contest)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

     headerlay=binding.header
        headerlay.headertxt.text= SingletonObjectAccess.getGlobleOblect(MatchContestActivity@this).getHeaderText()
        binding.matchtabLayout.addTab(
            binding.matchtabLayout.newTab().setText("Contest"))

        binding.matchtabLayout.addTab(
            binding.matchtabLayout.newTab().setText("My Contests(0)"))

        binding.matchtabLayout.addTab(
            binding.matchtabLayout.newTab().setText("My Team(0)")
        )



        binding.matchtabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = MatchContestTabsAdapter(
            this, supportFragmentManager,
            binding.matchtabLayout.tabCount
        )
        binding.viewPager.adapter = adapter
        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.matchtabLayout))
        binding.matchtabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })



    }
}