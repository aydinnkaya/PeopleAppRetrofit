package com.example.kisileruygulamasi.retrofit

import com.example.kisileruygulamasi.data.entity.kisilerCevap
import retrofit2.http.GET

interface kisilerDao {
    // database access object
    // http://kasimadalan.pe.hu/kisiler/tum_kisiler.php
    // http://kasimadalan.pe.hu/  --> Base URL
    // kisiler/tum_kisiler.php     --> Api URL

    @GET("kisiler/tum_kisiler.php ")
    suspend fun kisileriYukle() : kisilerCevap

}