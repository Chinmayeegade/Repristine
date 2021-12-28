package com.example.final_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class Datbase : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datbase)
    }

    class SharedViewModel : ViewModel() {

        // variable to contain message whenever
        // it gets changed/modified(mutable)
        val message = MutableLiveData<String>()

        // function to send message
        fun sendMessage(text: String) {
            message.value = text
        }
    }
}
