package com.example.viewmodeldemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo1.databinding.ActivityLiveDataDemoBinding

class LiveDataDemo : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDataDemoBinding
    private lateinit var viewModel: LiveDataViewModel
    private lateinit var viewModelFactory: LiveDataDemoViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data_demo)
        viewModelFactory = LiveDataDemoViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(LiveDataViewModel::class.java)
        viewModel.totalData.observe(this, Observer {
            binding.tvResult.text = it.toString()
        })
        binding.btnAdd.setOnClickListener {

            viewModel.setTotal((binding.etNum.text.toString().toInt()))

        }
    }
}
