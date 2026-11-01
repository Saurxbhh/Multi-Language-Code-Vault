package com.nirbhay.databindmvvm.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.CricketSelectPlayersActivity
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.models.ItemsViewModel

class MakeFinaleTeamAdpater(private val mList: List<ItemsViewModel>, val contect : Context) : RecyclerView.Adapter<MakeFinaleTeamAdpater.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.make_team_row, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

//        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)
//
//        // sets the text to the textview from our itemHolder class
//        holder.textView.text = ItemsViewModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

//        val imageView: ImageView = itemView.findViewById(R.id.imageview)
//        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}