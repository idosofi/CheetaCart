package com.sofiwares.cheetacart.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.sofiwares.cheetacart.R
import com.sofiwares.cheetacart.data.formatter.CurrencyFormatter
import com.sofiwares.cheetacart.viewmodel.CartListViewModel
import kotlinx.android.synthetic.main.activity_cart.*


class CartActivity : AppCompatActivity() {

    private var mAdapter: CartItemListAdapter? = null
    private lateinit var mLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val model = ViewModelProviders.of(this).get(CartListViewModel::class.java)
        model.cartList.observe(this, Observer { updatedList ->
            cartRecyclerView.adapter = CartItemListAdapter(updatedList!!)
        })
        model.cartTotal.observe(this, Observer { cartTotal ->
            totalCalculated.text = CurrencyFormatter(cartTotal!!).format()
        })

        // Set the layout manager for the recyclerView
        mLayoutManager = LinearLayoutManager(this)

        // use a linear layout manager
        cartRecyclerView.layoutManager = mLayoutManager

        // specify an adapter
        mAdapter = CartItemListAdapter(model.cartList.value!!)
        cartRecyclerView.adapter = mAdapter
    }
}
