package com.spbdemosss.geoappforpvo.presentation.points

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.spbdemosss.geoappforpvo.R

class ActivityPoints : AppCompatActivity() {
    private lateinit var viewModel: MainPointViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_points)
        viewModel = ViewModelProvider(this)[MainPointViewModel::class.java]
        viewModel.pointList.observe(this){
            Log.d("MainAct", it.toString())
        }
    }
}