package com.example.mid.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PhoneAdapter (private val listPhones: List<Phone>): RecyclerView.Adapter<PhoneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PhoneViewHolder.from(parent)

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        holder.bind(listPhones[position])
    }

    override fun getItemCount() = listPhones.size
}