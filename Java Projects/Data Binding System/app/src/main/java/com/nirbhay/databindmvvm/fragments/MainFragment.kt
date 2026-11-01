package com.nirbhay.databindmvvm.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.MatchContestActivity

import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.adapters.ContestAdapter
import com.nirbhay.databindmvvm.databinding.MainFragmentBinding
import com.nirbhay.databindmvvm.interfaces.ContestDataCallback
import com.nirbhay.databindmvvm.interfaces.ContestWithDetailCallBack
import com.nirbhay.databindmvvm.models.ItemsViewModel
import com.nirbhay.databindmvvm.models.contest_model.ContestDetailWrapper
import com.nirbhay.databindmvvm.repositorys.ContestDetailRepositroy

class MainFragment : Fragment(), ContestWithDetailCallBack, ContestDataCallback {

    lateinit var fm: FragmentManager
    private lateinit var binding : MainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout and obtain the binding object
        binding =
            DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        val rootView = binding.root
        fm = parentFragmentManager
        //val recyclerview = view?.findViewById<RecyclerView>(R.id.recyclerview)
        ContestDetailRepositroy().contestDetails(this)
        // this creates a vertical layout Manager


        return rootView
    }

    override fun onClickContestNag() {

        val intent = Intent(requireActivity(), MatchContestActivity::class.java)
        requireActivity().startActivity(intent)
    }

    override fun getDataContestList(data: ContestDetailWrapper) {
        binding.recyclerview?.layoutManager = LinearLayoutManager(requireContext())
        val adapter = ContestAdapter(data,requireActivity(),this)


        binding.recyclerview?.adapter = adapter
    }
}