package com.example.getirclone

import java.io.Serializable

data class Urunler(var urun_id:Int,
                   var urun_fiyat:String,
                   var urun_adi:String,
                   var urun_gram:String,
                   var urun_resim:String): Serializable {

}