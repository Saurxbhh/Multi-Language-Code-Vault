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
import com.nirbhay.databindmvvm.adapters.MakeFinaleTeamAdpater
import com.nirbhay.databindmvvm.adapters.PlayerCustomAdapter
import com.nirbhay.databindmvvm.adapters.PlayerSelectedAdapter
import com.nirbhay.databindmvvm.adapters.TabsAdapter
import com.nirbhay.databindmvvm.databinding.ActivityMainBinding
import com.nirbhay.databindmvvm.databinding.MakeFinalTeamCaptBinding
import com.nirbhay.databindmvvm.databinding.PichActivityBinding
import com.nirbhay.databindmvvm.databinding.WinningListPrizeBinding
import com.nirbhay.databindmvvm.models.ItemsViewModel


class WinningPrizeListActivity : AppCompatActivity() {

    lateinit var binding : WinningListPrizeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.winning_list_prize)



        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

//        binding.teammake.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL ,false)
//        val wkdata = ArrayList<ItemsViewModel>()
//        for (i in 1..11) {
//            wkdata.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
//        }
//        val wkadapter = MakeFinaleTeamAdpater(wkdata,this)
//        binding.teammake.adapter = wkadapter
//




    }
}