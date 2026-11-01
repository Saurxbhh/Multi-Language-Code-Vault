package com.nirbhay.databindmvvm.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nirbhay.databindmvvm.fragments.*
import com.nirbhay.databindmvvm.fragments.cricket_selected_players.AR_Fragment
import com.nirbhay.databindmvvm.fragments.cricket_selected_players.BAT_Fragment
import com.nirbhay.databindmvvm.fragments.cricket_selected_players.BOWL_Fragment
import com.nirbhay.databindmvvm.fragments.cricket_selected_players.WK_Fragment

@Suppress("DEPRECATION")
internal class PlayerSelectedTabsAdpater(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int,
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                WK_Fragment()
            }
            1 -> {
                BAT_Fragment()
            }
            2 -> {
                AR_Fragment()
            }
            3 -> {
                BOWL_Fragment()
            }

            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}