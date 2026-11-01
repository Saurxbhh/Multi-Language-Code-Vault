package com.nirbhay.databindmvvm.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.MatchContestActivity
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.adapters.ContestAdapter
import com.nirbhay.databindmvvm.interfaces.ContestDataCallback
import com.nirbhay.databindmvvm.interfaces.ContestWithDetailCallBack
import com.nirbhay.databindmvvm.models.ItemsViewModel
import com.nirbhay.databindmvvm.models.contest_model.ContestDetailWrapper
import com.nirbhay.databindmvvm.repositorys.ContestDetailRepositroy
import com.nirbhay.databindmvvm.services.APIs
import com.nirbhay.databindmvvm.utils.SingletonObjectAccess
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment(),ContestWithDetailCallBack , ContestDataCallback{

     var data : ArrayList<ItemsViewModel>?=null
     var  recyclerview: RecyclerView?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val view = inflater.inflate(R.layout.main_fragment, container, false)
        //binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
       // val rootView = binding.root

//        fm = parentFragmentManager
        recyclerview = view?.findViewById<RecyclerView>(R.id.recyclerview)

        data= ArrayList<ItemsViewModel>()

        ContestDetailRepositroy().contestDetails(this)




        return view
    }

    fun Livematch()
    {
        data?.clear()
        for (i in 1..2) {
            data?.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
        }


    }




    override fun onClickContestNag() {
        val intent = Intent(requireActivity(), MatchContestActivity::class.java)
        requireActivity().startActivity(intent)
    }

    override fun getDataContestList(data: ContestDetailWrapper) {

        Log.d("Data", data.toString())
    }


}