package com.example.final_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MessageReceiverFragment : Fragment() {
    //to contain and display shared message
    lateinit var displayMsg: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the fragment layout
        return inflater.inflate(R.layout.fragment_message_receiver, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //reference for the container declared above
        displayMsg = view.findViewById(R.id.textViewReceiver)
        //create object of SharedViewModel
        val model = ViewModelProvider(requireActivity()).get(Datbase.SharedViewModel::class.java)
        //observing the change in the message declared in SharedViewModel
        model.message.observe(viewLifecycleOwner, Observer {
            //updating data in displayMsg
            displayMsg.text = it
        })
    }
}