package com.peshale.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.peshale.affirmationapp.adapter.ItemAdapter
import com.peshale.affirmationapp.data.DataSource
import com.peshale.affirmationapp.databinding.ActivityMainBinding
import com.peshale.affirmationapp.model.Affirmation

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val dataSource: List<Affirmation> = DataSource().loadAffirmations()
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, dataSource)
        recyclerView.setHasFixedSize(true)
    }
}