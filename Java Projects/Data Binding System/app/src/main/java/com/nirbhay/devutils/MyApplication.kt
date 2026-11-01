package com.nirbhay.devutils

import android.app.Application
import android.util.Log


/*
 * Developer: Nirbhay
 * Date: 2023-8-07
 * Description: This MyApplication is responsible for Global Object and Init GETTER & SETTER functionality.
 *
 */
class MyApplication : Application() {




    override fun onCreate() {
        super.onCreate()
        setupGlobalExceptionHandler()
    }

    private fun setupGlobalExceptionHandler() {
        val defaultHandler = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            // Log the exception here
            Log.e("GlobalExceptionHandler", "Uncaught Exception occurred in thread ${thread.name}: $throwable")

            // You can perform additional actions like sending the crash report to a server
            // or saving it to a file here

            // Call the default handler for the system to handle the exception as well
            defaultHandler?.uncaughtException(thread, throwable)
        }
    }
    private fun handleUncaughtException(throwable: Throwable) {
        // Handle the exception and show the error dialog
        // You can customize the error handling logic and dialog display as per your requirements
        //showErrorDialog(throwable.message)
        // Optional: Perform any necessary clean-up or logging tasks here
        // ...
        // Terminate the app if required
        System.exit(1)
    }




}