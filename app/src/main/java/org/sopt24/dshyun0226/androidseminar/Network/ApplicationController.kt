package org.sopt24.dshyun0226.androidseminar.Network

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApplicationController: Application(){
    private val baseURL = "http://hyunjkluz.ml:2424/"
    lateinit var networkService: NetworkService

    companion object {
        lateinit var Instance: ApplicationController //appcontroller 에서 사용할 instance들을 저장
    }

    override fun onCreate() {
        super.onCreate()
        Instance = this //instance에 자기의 context의 instance를 저장
        builderNetwork()
    }

    fun builderNetwork(){
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

            networkService = retrofit.create(NetworkService:: class.java)
    }
}