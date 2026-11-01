package com.nirbhay.databindmvvm.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.models.ItemsViewModel
import com.nirbhay.databindmvvm.models.PlayerModel

class PlayerSelectedAdapter_BAT(private val mList: List<PlayerModel>) : RecyclerView.Adapter<PlayerSelectedAdapter_BAT.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pick_players_row, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

//        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)
//
//        // sets the text to the textview from our itemHolder class
        holder.teamName.text = ItemsViewModel.playfor
        holder.playername.text = ItemsViewModel.name
        holder.selby.text = ItemsViewModel.selBy
        holder.lastmatch.text = ItemsViewModel.playedLastMatch

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val teamName: TextView = itemView.findViewById(R.id.teamName)
        val playername: TextView = itemView.findViewById(R.id.playername)
        val selby: TextView = itemView.findViewById(R.id.selby)
        val lastmatch: TextView = itemView.findViewById(R.id.lastmatch)

    }
}