package com.sofiwares.cheetacart.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.sofiwares.cheetacart.R

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class CartItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var photo: ImageView = itemView.findViewById(R.id.photo)
    var name: TextView = itemView.findViewById(R.id.name)
    var price: TextView = itemView.findViewById(R.id.price)
    var quantity: TextView = itemView.findViewById(R.id.quantity)
    var substitutable: ImageView = itemView.findViewById(R.id.substitutable)
    var subTotal: TextView = itemView.findViewById(R.id.subTotal)
}