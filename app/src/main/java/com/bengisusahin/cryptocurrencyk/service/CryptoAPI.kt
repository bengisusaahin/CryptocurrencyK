package com.bengisusahin.cryptocurrencyk.service

import com.bengisusahin.cryptocurrencyk.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {
    //GET, POST, UPDATE, DELETE

    //https://raw.githubusercontent.com/  -> url nin bazı
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json -> url nin geri kalan kısmı

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    //fun getData() : Call<List<CryptoModel>>
    //fun getData(): Observable<List<CryptoModel>>
    suspend fun getData(): Response<List<CryptoModel>>
}