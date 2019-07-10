package com.example.prototype3.PL.Paralysiss4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ParalysisS4AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, ParalysisS4NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}