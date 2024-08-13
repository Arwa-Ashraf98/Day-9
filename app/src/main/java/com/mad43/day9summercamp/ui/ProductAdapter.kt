package com.mad43.day9summercamp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.mad43.day9summercamp.R
import com.mad43.day9summercamp.models.Product

class ProductAdapter(private var list : List<Product>) : Adapter<ProductAdapter.ProductViewHolder>() {

    fun setList(list : List<Product>) {
        this.list = list
    }

    inner class ProductViewHolder(itemView: View) : ViewHolder(itemView) {
        val textViewName : TextView = itemView.findViewById(R.id.tv_product)
        val imageViewProduct : ImageView = itemView.findViewById(R.id.iv_product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.item_product , parent , false)
       return ProductViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val model = list[position]
        holder.apply {
            holder.textViewName.text = model.title
            // using glide to preview image take 1 context 2 url 3 image
            Glide.with(holder.itemView)
                .load(model.thumbnail)
                .placeholder(R.drawable.loading)
                .error(R.drawable.baseline_error_24)
                .into(holder.imageViewProduct)
        }
    }
}