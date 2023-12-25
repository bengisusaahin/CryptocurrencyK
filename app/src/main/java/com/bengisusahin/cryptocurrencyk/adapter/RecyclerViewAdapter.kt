package com.bengisusahin.cryptocurrencyk.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bengisusahin.cryptocurrencyk.R
import com.bengisusahin.cryptocurrencyk.databinding.RowLayoutBinding
import com.bengisusahin.cryptocurrencyk.model.CryptoModel

class RecyclerViewAdapter(private val cryptoList : ArrayList<CryptoModel>, private val listener:Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    interface Listener{
        fun onItemClick(cryptoModel: CryptoModel)
    }
    private val colors: Array<String> = arrayOf("#076d7d","#1f2f32","#fce9d5","#eceeda","#008080","#4633f2","#1dd7f3","#3285f3")
    class RowHolder(val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cryptoModel: CryptoModel, colors: Array<String>, position: Int, listener: Listener){
            itemView.setOnClickListener {
                listener.onItemClick(cryptoModel)
            }
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]))
            binding.textName.text = cryptoModel.currency
            binding.textPrice.text = cryptoModel.price

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RowHolder(binding)
    }

    override fun getItemCount(): Int {
        return cryptoList.count()
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cryptoList[position], colors, position, listener )
    }


}