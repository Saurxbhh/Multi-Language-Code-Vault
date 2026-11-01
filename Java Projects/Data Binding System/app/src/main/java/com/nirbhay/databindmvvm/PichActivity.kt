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


class PichActivity : AppCompatActivity() {

    lateinit var binding : PichActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.pich_activity)



        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        binding.wklist.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        val wkdata = ArrayList<ItemsViewModel>()
        for (i in 1..2) {
            wkdata.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
        }
        val wkadapter = PlayerCustomAdapter(wkdata,this)
        binding.wklist.adapter = wkadapter


        binding.batlist.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        val batdata = ArrayList<ItemsViewModel>()
        for (i in 1..3) {
            batdata.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
        }
        val batadapter = PlayerCustomAdapter(batdata,this)
        binding.batlist.adapter = batadapter


        binding.arlist.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        val ardata = ArrayList<ItemsViewModel>()
        for (i in 1..2) {
            ardata.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
        }
        val aradapter = PlayerCustomAdapter(ardata,this)
        binding.arlist.adapter = aradapter


        binding.bowllist.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL ,false)
        val bowldata = ArrayList<ItemsViewModel>()
        for (i in 1..4) {
            bowldata.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
        }
        val bowladapter = PlayerCustomAdapter(bowldata,this)
        binding.bowllist.adapter = bowladapter



    }
}