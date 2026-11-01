package com.nirbhay.databindmvvm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil


import com.nirbhay.databindmvvm.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding : LoginActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.login_activity)
        binding.loginbtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }
}