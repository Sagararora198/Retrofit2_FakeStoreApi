package com.example.retrofit

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver:BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        if (p1?.action == Intent.ACTION_POWER_CONNECTED) {
            Toast.makeText(p0, "Charging connected", Toast.LENGTH_LONG).show()
            Log.d("MyBroadcastReceiver", "Charging connected")
        }
    }
}