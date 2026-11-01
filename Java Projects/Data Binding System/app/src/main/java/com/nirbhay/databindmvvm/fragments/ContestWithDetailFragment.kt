package com.nirbhay.databindmvvm.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.adapters.ContestWithMatchDetailAdapter
import com.nirbhay.databindmvvm.databinding.MainFragmentBinding
import com.nirbhay.databindmvvm.interfaces.ContestwithPricePoolDataCallback

import com.nirbhay.databindmvvm.models.ItemsViewModel
import com.nirbhay.databindmvvm.models.contest_details_withpricepool.ContestWithPricePoolWrapper
import com.nirbhay.databindmvvm.repositorys.ContestDetailRepositroy
import com.nirbhay.databindmvvm.utils.SingletonObjectAccess

class ContestWithDetailFragment : Fragment(), ContestwithPricePoolDataCallback {
    private lateinit var fm: FragmentManager
    private lateinit var binding : MainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        val rootView = binding.root

        fm = parentFragmentManager
        //val recyclerview = view?.findViewById<RecyclerView>(R.id.recyclerview)
        binding.recyclerview?.layoutManager = LinearLayoutManager(requireContext())
        // this creates a vertical layout Manager

        var teamaId = SingletonObjectAccess.getGlobleOblect(requireActivity()).getTeamAId()
        var contId = SingletonObjectAccess.getGlobleOblect(requireActivity()).getContesttId()
        var teambId = SingletonObjectAccess.getGlobleOblect(requireActivity()).getTeamBId()
        var fee = SingletonObjectAccess.getGlobleOblect(requireActivity()).getFeeVal()

        teamaId?.let {
            contId?.let { it1 ->
                teambId?.let { it2 ->
                    ContestDetailRepositroy().contestDetailsWithPricePool(this, it1,
                        it, it2,fee)
                }
            }
        }
//        val data = ArrayList<ItemsViewModel>()
//
//        for (i in 1..20) {
//            data.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
//        }

        return rootView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun getDataContestList(data: ContestWithPricePoolWrapper) {


        val adapter = ContestWithMatchDetailAdapter(data,requireActivity())

        // Setting the Adapter with the recyclerview
        binding.recyclerview?.adapter = adapter
    }


}