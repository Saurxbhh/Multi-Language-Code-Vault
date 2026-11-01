package com.nirbhay.databindmvvm.interfaces

import com.nirbhay.databindmvvm.models.contest_details_withpricepool.ContestWithPricePoolWrapper
import com.nirbhay.databindmvvm.models.contest_model.ContestDetailWrapper

interface ContestwithPricePoolDataCallback {
    fun getDataContestList(data: ContestWithPricePoolWrapper)
}