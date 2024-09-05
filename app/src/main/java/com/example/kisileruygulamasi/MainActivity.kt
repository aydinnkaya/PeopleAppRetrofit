package com.example.kisileruygulamasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.kisileruygulamasi.ui.theme.KisilerUygulamasiTheme
import com.example.kisileruygulamasi.uix.viewmodel.AnasayfaViewModel
import com.example.kisileruygulamasi.uix.viewmodel.KisiDetayViewModel
import com.example.kisileruygulamasi.uix.viewmodel.KisiKayitViewModel
import com.example.kisileruygulamasi.uix.views.SayfaGecisleri
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val anasayfaViewModel:AnasayfaViewModel by viewModels()
    val kisiKayitViewModel:KisiKayitViewModel by viewModels()
    val kisiDetayViewModel:KisiDetayViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KisilerUygulamasiTheme {
                SayfaGecisleri(anasayfaViewModel,kisiKayitViewModel,kisiDetayViewModel)
            }
        }
    }
}
