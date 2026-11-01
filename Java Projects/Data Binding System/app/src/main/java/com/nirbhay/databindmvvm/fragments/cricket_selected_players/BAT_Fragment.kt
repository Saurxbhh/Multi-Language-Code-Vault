package com.nirbhay.databindmvvm.fragments.cricket_selected_players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.adapters.PlayerSelectedAdapter_BAT
import com.nirbhay.databindmvvm.models.PlayerModel

class BAT_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.bat_fragment, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        val data = ArrayList<PlayerModel>()
        data.add(PlayerModel(R.drawable.hockey, "S Dhawan ","PBKS", "536","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "Y Jaiswal ","RR", "450","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "S Hetmyer ","RR", "600","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "J Root ","RR", "536","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "D Padikkal","RR", "0","Played Last Match(Sub)","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "B Rajapaksa","PBKS", "0","","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "S Khan","PBKS", "0","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "D Jurel","RR", "0","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "A Taide","PBKS", "0","Played Last Match","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "H Singh","PBKS", "0","","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "A Basith","RR", "0","","8.5","Sel by 61.54%"))
        data.add(PlayerModel(R.drawable.hockey, "S Singh","PBKS", "0","","8.5","Sel by 61.54%"))

//        for (i in 1..5) {
//            data.add(ItemsViewModel(R.drawable.hockey, "Item " + i))
//        }
        val adapter = PlayerSelectedAdapter_BAT(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}