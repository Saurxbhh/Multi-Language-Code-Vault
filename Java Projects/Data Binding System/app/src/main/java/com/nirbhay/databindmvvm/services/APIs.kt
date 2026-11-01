package com.nirbhay.databindmvvm.services

import com.nirbhay.databindmvvm.models.contest_details_withpricepool.ContestWithPricePoolWrapper
import com.nirbhay.databindmvvm.models.contest_model.ContestDetailWrapper
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface APIs {
    @GET("")
    fun contestList(): Call<ContestDetailWrapper?>

    @GET("")
    fun getContestListWithPricePool(@Query("param1") param1 : Int, @Query("param2") param1 : Int,  @Query("param3") param1 : Int): Call<Void?>
}