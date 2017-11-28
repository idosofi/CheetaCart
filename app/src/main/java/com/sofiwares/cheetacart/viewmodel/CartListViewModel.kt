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

    init {
        cartList.value = arrayListOf()
        loadCart()
    }

    private fun loadCart() {
        LoadCartTask(cartList).execute()
    }

    class LoadCartTask(private var cartList: MutableLiveData<ArrayList<CartItemModel>>): AsyncTask<Void, Void, String>() {

        override fun doInBackground(vararg p0: Void?): String {
            val cart = Retrofit.Builder()
                    .baseUrl("http://www.mocky.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()

            val api = cart.create(CartAPI::class.java)
            val list = api.getCart().execute().body()?.orderItemsInformation
            if (list != null)
                cartList.postValue(ArrayList(list))

            return ""
        }
    }
}