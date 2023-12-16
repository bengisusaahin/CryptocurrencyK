package com.bengisusahin.cryptocurrencyk.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    //@SerializedName("currency") kotlinde gerek yok
    val currency:String,
    val price:String
)