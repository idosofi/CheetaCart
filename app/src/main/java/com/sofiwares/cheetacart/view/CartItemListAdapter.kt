package com.sofiwares.cheetacart.view

import android.support.v4.view.ViewCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.sofiwares.cheetacart.R
import com.sofiwares.cheetacart.data.PackagingType
import com.sofiwares.cheetacart.data.converter.PackagingTypeToPriceConverter
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
        holder?.price?.text = PackagingTypeToPriceConverter(mDataSet[position].packagingType, mDataSet[position].price).convert()
        ViewCompat.setBackgroundTintList(holder?.substitutable,SubstitutableToColorStateListConveter(mDataSet[position].substitutable).convert())

        // Load the image using glide library
        Glide.with(holder?.itemView?.context).load(
                when(mDataSet[position].packagingType) {
                    PackagingType.UNIT -> mDataSet[position].unitPhotoUrl
                    PackagingType.CASE -> mDataSet[position].casePhotoUrl
                    PackagingType.WEIGHT -> mDataSet[position].weightPhotoUrl
                }).into(holder?.photo)
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }
}