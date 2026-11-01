package com.nirbhay.databindmvvm.adapters

import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.os.Build
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.nirbhay.databindmvvm.CricketSelectPlayersActivity
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.WinningPrizeListActivity
import com.nirbhay.databindmvvm.models.ItemsViewModel
import com.nirbhay.databindmvvm.models.contest_details_withpricepool.ContestWithPricePoolWrapper

class ContestWithMatchDetailAdapter(private val mList: ContestWithPricePoolWrapper, val contect : Context) : RecyclerView.Adapter<ContestWithMatchDetailAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contest_with_match_row, parent, false)
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.contest_row, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList.response.data[position]


        holder.contestname.text=ItemsViewModel.ContestName
        var totaldisVal = ItemsViewModel.contest_entry_fee.toDouble()*2
        holder.discountfee.text = "Entry₹$totaldisVal"
        holder.discountfee.paintFlags =  holder.discountfee.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        var pp =ItemsViewModel.prize_pool
        var feeval =ItemsViewModel.contest_entry_fee
        holder.pricepool.text= "₹$pp"
        holder.fee.text = "₹$feeval"
        holder.leftspots.text= ItemsViewModel.leftspots+" spots left"
        holder.totalspots.text= ItemsViewModel.spots+" spots"
        holder.progressBar.max = ItemsViewModel.spots.toInt()
        //val progressValue = (ItemsViewModel.leftspots.toInt() * holder.progressBar.max).toInt()

        var totalOpt= ItemsViewModel.spots.toInt()-ItemsViewModel.leftspots.toInt()
// Set the progress of the ProgressBar
        holder.progressBar.progress = totalOpt

        holder.fee.setOnClickListener {
            val intent = Intent(contect, CricketSelectPlayersActivity::class.java)
            contect.startActivity(intent)
        }
        holder.layContest.setOnClickListener {
            val intent = Intent(contect, WinningPrizeListActivity::class.java)
            contect.startActivity(intent)
        }
//        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)
//
//        // sets the text to the textview from our itemHolder class
//        holder.textView.text = ItemsViewModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.response.data.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        //val fee : TextView = itemView.findViewById(R.id.selectbtn)
        val contestname : TextView = itemView.findViewById(R.id.contestname)
        val discountfee : TextView = itemView.findViewById(R.id.discountfee)
        val pricepool : TextView = itemView.findViewById(R.id.pricepool)
        val fee : TextView = itemView.findViewById(R.id.fee)
        val leftspots : TextView = itemView.findViewById(R.id.leftspots)
        val totalspots : TextView = itemView.findViewById(R.id.totalspots)
        val layContest : LinearLayout = itemView.findViewById(R.id.layContest)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
//        val imageView: ImageView = itemView.findViewById(R.id.imageview)
//        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}