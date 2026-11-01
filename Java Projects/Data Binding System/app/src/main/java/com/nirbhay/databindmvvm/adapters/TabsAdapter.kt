package com.nirbhay.databindmvvm.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nirbhay.databindmvvm.fragments.*
import com.nirbhay.devutils.MySingleton

@Suppress("DEPRECATION")
internal class TabsAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int,
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 ->
            {
                MainFragment()
            }
            1 -> {
                FootballFragment()
            }
            2 -> {
                KabaddiFragment()
            }
            3 -> {
                BasketBallFragment()
            }
            4 -> {
                HockeyFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }

}