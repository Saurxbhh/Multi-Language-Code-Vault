package com.nirbhay.databindmvvm.fragments.cricket_selected_players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.adapters.PlayerSelectedAdapter_AR
import com.nirbhay.databindmvvm.models.PlayerModel

class AR_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.ar_fragment, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        val data = ArrayList<PlayerModel>()
        data.add(PlayerModel(R.drawable.hockey, "R Ashwin ","RR", "536","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "L Livingstone ","PBKS", "450","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "S Curran ","PBKS", "600","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "J Holder ","RR", "536","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "S Raza ","PBKS", "230","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "M Short ","PBKS", "60","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "R Parag ","RR", "140","Played Last Match","8.5","Sel by 61.54%"))
//        for (i in 1..5) {
//            data.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
//        }
        val adapter = PlayerSelectedAdapter_AR(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}