package com.sofiwares.cheetacart.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.os.AsyncTask
import com.sofiwares.cheetacart.data.json.CartAPI
import com.sofiwares.cheetacart.model.CartItemModel
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class CartListViewModel: ViewModel() {
    var cartList = MutableLiveData<ArrayList<CartItemModel>>()
    var cartTotal = MutableLiveData<Double>()

    init {
        cartList.value = arrayListOf()
        loadCart()
    }

    private fun loadCart() {
        LoadCartTask(cartList, cartTotal).execute()
    }

    class LoadCartTask(private var cartList: MutableLiveData<ArrayList<CartItemModel>>,
                       private var cartTotal: MutableLiveData<Double>): AsyncTask<Void, Void, String>() {

        override fun doInBackground(vararg p0: Void?): String {
            val cart = Retrofit.Builder()
                    .baseUrl("http://www.mocky.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()

            val api = cart.create(CartAPI::class.java)
            val cartResponse = api.getCart().execute().body()

            if (cartResponse?.orderItemsInformation != null)
                cartList.postValue(ArrayList(cartResponse.orderItemsInformation))

            cartTotal.postValue(cartResponse?.cartTotal?.toDouble())

            return ""
        }
    }
}