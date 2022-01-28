package com.rifat.megaplex.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rifat.megaplex.databinding.ItemCartBinding

class RvAdapter(
    var cartList: List<CartAdapter>,
) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(cartList[position]){
                binding.tvproductnamecart.text = this.productname
                binding.tvpricecart.text = this.prodcutprice.toString()
            }
        }
    }

    // return the size of languageList
    override fun getItemCount(): Int {
        return cartList.size
    }
}