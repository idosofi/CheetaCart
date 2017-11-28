package com.sofiwares.cheetacart.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.sofiwares.cheetacart.model.CartItemModel

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
        //cartList.value =
    }
}