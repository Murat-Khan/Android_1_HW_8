package com.murat.android_1_hw_8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.murat.android_1_hw_8.databinding.ItemCinemaBinding

class CinemaAdapter(
    private val cinemaList: List<CinemaData>,
    var onClick:(position:Int)->Unit
):RecyclerView.Adapter<CinemaAdapter.CinemaHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaHolder {
        return CinemaHolder(ItemCinemaBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CinemaHolder, position: Int) {
        holder.onBind(cinemaList[position], position)
    }

    override fun getItemCount() = cinemaList.size


    inner class CinemaHolder(private val binding: ItemCinemaBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(data:CinemaData, position: Int){
           itemView.setOnClickListener {
               onClick(position)
           }
            binding.tvGenre.text = data.cinemaGenre
            binding.tvName.text = data.cinemaName
            Glide.with(binding.imageCinema).load(data.cinemaImage).into(binding.imageCinema)


        }

    }
}