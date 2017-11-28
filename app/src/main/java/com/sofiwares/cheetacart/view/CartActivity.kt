package com.sofiwares.cheetacart.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.sofiwares.cheetacart.R
import com.sofiwares.cheetacart.viewmodel.CartListViewModel
import kotlinx.android.synthetic.main.activity_cart.*
import com.sofiwares.cheetacart.data.json.APIClient
import com.sofiwares.cheetacart.data.json.APIService


class CartActivity : AppCompatActivity() {

    private var mAdapter: CartItemListAdapter? = null
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var apiInterface: APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        apiInterface = APIClient.getClient().create(APIService::class.java)


        val model = ViewModelProviders.of(this).get(CartListViewModel::class.java)
        model.cartList.observe(this, Observer { updatedList ->

        })
//        model.videoList.observe(this, Observer<ArrayList<ContentModel>> { newList ->
//            // videoList has changed, update the UI
//            if (model.videoList.value!!.size > 0)
//                transitionTo(SearchActivityScene.VIDEO_LIST)
//            mAdapter?.loadNewItems(newList)
//        })

        // Set the layout manager for the recyclerView
        mLayoutManager = LinearLayoutManager(this)

        // use a linear layout manager
        cartRecyclerView.layoutManager = mLayoutManager

        // specify an adapter (see also next example)
        mAdapter = CartItemListAdapter(model.cartList.value!!)
        cartRecyclerView.adapter = mAdapter
    }
}
