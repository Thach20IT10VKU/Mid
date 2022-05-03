package com.example.mid.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mid.databinding.ItemPhoneBinding

class PhoneViewHolder private constructor(private val binding: ItemPhoneBinding): RecyclerView.ViewHolder(binding.root){

    companion object {
        fun from(parent: ViewGroup): PhoneViewHolder {
            val binding = ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return PhoneViewHolder(binding)
        }
    }

    fun bind(phone: Phone) {
        binding.name.text = phone.name
        binding.phone.text = phone.phoneNumber
    }
}