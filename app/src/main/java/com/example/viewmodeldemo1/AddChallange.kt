package com.example.viewmodeldemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo1.databinding.ActivityAddChallangeBinding

class AddChallange : AppCompatActivity() {
    private lateinit var binding: ActivityAddChallangeBinding
    private lateinit var viewModel: AddChallengeViewModel
    private lateinit var viewModelFactory: AddChallageViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_challange)
        viewModelFactory = AddChallageViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(AddChallengeViewModel::class.java)
        binding.tvResult.text = viewModel.getTotal().toString()
        binding.btnAdd.setOnClickListener {

            viewModel.setTotal((binding.etNum.text.toString().toInt()))
            binding.tvResult.text = viewModel.getTotal().toString()

        }
    }
}
