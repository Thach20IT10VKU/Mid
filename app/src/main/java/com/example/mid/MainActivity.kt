package com.example.mid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mid.databinding.ActivityMainBinding
import com.example.mid.recyclerview.Phone
import com.example.mid.recyclerview.PhoneAdapter

class MainActivity: AppCompatActivity () {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listPhones.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = PhoneAdapter(Phones)
        }

        binding.fabAdd.setOnClickListener {
            val intent = Intent(this@MainActivity, AddPhoneActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // binding.listPhones.adapter = MusicAdapter(Phones)
        binding.listPhones.adapter?.notifyDataSetChanged()
    }

    companion object {
        val Phones = mutableListOf<Phone>()
    }
}