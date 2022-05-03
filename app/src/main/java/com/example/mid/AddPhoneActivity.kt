package com.example.mid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mid.databinding.ActivityAddPhoneBinding
import com.example.mid.recyclerview.Phone

class AddPhoneActivity: AppCompatActivity () {
    private lateinit var binding: ActivityAddPhoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val singer = binding.edtSinger.text.toString()

            val music = Phone(name, singer)

            MainActivity.Musics.add(music)


            finish()
        }
    }
}