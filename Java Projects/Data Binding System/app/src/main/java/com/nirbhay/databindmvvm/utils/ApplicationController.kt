package com.nirbhay.databindmvvm.utils

import android.app.Application

class ApplicationController : Application() {

    var teamaId : Int?=null
    var teambId : Int?=null
    var contId : Int?=null
    var fee : String?=null
    var headerText : String?=null
    override fun onCreate() {
        super.onCreate()

//
    }


    fun setTeamAId(str: Int) {
        teamaId = str
    }

    fun getTeamAId(): Int? {

        return teamaId
    }

    fun setTeamBId(str: Int) {
        teambId = str
    }

    fun getTeamBId(): Int? {

        return teambId
    }

    fun setContesttId(str: Int) {
        contId = str
    }

    fun getContesttId(): Int? {

        return contId
    }


    fun setFeeVal(str: String) {
        fee = str
    }

    fun getFeeVal(): String? {

        return fee
    }


    @JvmName("setHeaderText1")
    fun setHeaderText(str: String) {
        headerText = str
    }

    @JvmName("getHeaderText1")
    fun getHeaderText(): String? {

        return headerText
    }
}