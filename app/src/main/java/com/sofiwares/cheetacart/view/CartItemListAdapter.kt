package com.sofiwares.cheetacart.view

import android.support.v4.view.ViewCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.sofiwares.cheetacart.R
import com.sofiwares.cheetacart.data.PackagingType
import com.sofiwares.cheetacart.data.converter.SubstitutableToColorStateListConveter
import com.sofiwares.cheetacart.data.formatter.CurrencyFormatter
import com.sofiwares.cheetacart.model.CartItemModel

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class CartItemListAdapter(private var mDataSet: ArrayList<CartItemModel>): RecyclerView.Adapter<CartItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CartItemViewHolder{
        // create a new view
        val v = LayoutInflater.from(parent?.context)
                .inflate(R.layout.cart_item_view, parent, false)

        return CartItemViewHolder(v)
    }

    override fun onBindViewHolder(holder: CartItemViewHolder?, position: Int) {
        holder?.name?.text = mDataSet[position].name
        holder?.subTotal?.text = CurrencyFormatter(mDataSet[position].subTotal).format()
        holder?.quantity?.text = mDataSet[position].quantity.toString()
        holder?.price?.text = mDataSet[position].quantity.toString()
        ViewCompat.setBackgroundTintList(holder?.substitutable,SubstitutableToColorStateListConveter(mDataSet[position].substitutable).convert())

        // Load the image using glide library
        Glide.with(holder?.itemView?.context).load(
                when(mDataSet[position].packagingType) {
                    PackagingType.UNIT -> mDataSet[position].unit_photo_url
                    PackagingType.CASE -> mDataSet[position].case_photo_url
                    PackagingType.WEIGHT -> mDataSet[position].weight_photo_url
                }).into(holder?.photo)
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }
}