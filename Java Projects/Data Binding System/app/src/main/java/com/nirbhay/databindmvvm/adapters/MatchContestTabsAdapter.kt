package com.nirbhay.databindmvvm.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nirbhay.databindmvvm.fragments.*

@Suppress("DEPRECATION")
internal class MatchContestTabsAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int,
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ContestWithDetailFragment()
            }
            1 -> {
                MyContestFragment()
            }
            2 -> {
                MyTeamFragment()
            }

            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}