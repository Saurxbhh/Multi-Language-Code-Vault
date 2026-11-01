package com.nirbhay.databindmvvm.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nirbhay.databindmvvm.CricketSelectPlayersActivity
import com.nirbhay.databindmvvm.R
import com.nirbhay.databindmvvm.interfaces.ContestWithDetailCallBack
import com.nirbhay.databindmvvm.models.ItemsViewModel
import com.nirbhay.databindmvvm.models.contest_model.ContestDetailWrapper
import com.nirbhay.databindmvvm.utils.Const
import com.nirbhay.databindmvvm.utils.SingletonObjectAccess

class ContestAdapter(private var mList: ContestDetailWrapper, val contect : Context, val callback : ContestWithDetailCallBack) : RecyclerView.Adapter<ContestAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.contest_row, parent, false)

        return ViewHolder(view)
    }

    fun updateData(newData: ContestDetailWrapper) {
        mList.response.data.clear()
        mList.response.data.addAll(newData.response.data)
        notifyDataSetChanged()
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList.response.data[position]

        holder.contestName.setText(ItemsViewModel.ContestName)
        holder.teamname.setText(ItemsViewModel.team_A_name)
        holder.teamnameb.setText(ItemsViewModel.team_B_name)
        holder.teamsortname.setText(ItemsViewModel.team_A_sort_code)
        holder.teamsortnameb.setText(ItemsViewModel.team_B_sort_code)
        holder.timerunning.setText(ItemsViewModel.contest_name)
        holder.contestName.setText(ItemsViewModel.contest_name)
        holder.pricepool.setText(ItemsViewModel.prize_pool)

        Glide.with(contect)
            .load(Const.BASE_URL_IMG+ItemsViewModel.team_A_logo)
            .placeholder(R.drawable.cricket_1ball) // Optional placeholder image
            .error(R.drawable.cricket_1ball) // Optional error image
            .into(holder.teamimg)
        Glide.with(contect)
            .load(Const.BASE_URL_IMG+ItemsViewModel.team_B_logo)
            .placeholder(R.drawable.cricket_1ball) // Optional placeholder image
            .error(R.drawable.cricket_1ball) // Optional error image
            .into(holder.teambimg)
        holder.layContest.setOnClickListener {
            SingletonObjectAccess.getGlobleOblect(contect).setHeaderText(ItemsViewModel.team_A_sort_code+" vs "+ItemsViewModel.team_B_sort_code)
            SingletonObjectAccess.getGlobleOblect(contect).setContesttId(ItemsViewModel.cont_id.toInt())
            SingletonObjectAccess.getGlobleOblect(contect).setTeamAId(ItemsViewModel.team_A_id.toInt())
            SingletonObjectAccess.getGlobleOblect(contect).setTeamBId(ItemsViewModel.team_B_id.toInt())
            SingletonObjectAccess.getGlobleOblect(contect).setFeeVal(ItemsViewModel.contest_entry_fee.toString())
           callback.onClickContestNag()
        }


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.response.data.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val contestName : TextView = itemView.findViewById(R.id.contestName)
        val teamname : TextView = itemView.findViewById(R.id.teamname)
        val teamnameb : TextView = itemView.findViewById(R.id.teamnameb)
        val teamsortname : TextView = itemView.findViewById(R.id.teamsortname)
        val teamsortnameb : TextView = itemView.findViewById(R.id.teamsortnameb)
        val timerunning : TextView = itemView.findViewById(R.id.timerunning)
        val dateofmatch : TextView = itemView.findViewById(R.id.dateofmatch)
        val teamimg : ImageView = itemView.findViewById(R.id.teamimg)
        val teambimg : ImageView = itemView.findViewById(R.id.teambimg)
        val pricepool : TextView = itemView.findViewById(R.id.pricepool)
        val layContest : LinearLayout = itemView.findViewById(R.id.layContest)

    }
}