package com.example.getirclone

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirclone.databinding.CardTasarimBinding

class UrunlerAdapter(var mContext: Context, var urunlerListesi:List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewUrunResim.setImageResource(mContext.resources.getIdentifier(
            urun.urun_resim,"drawable",mContext.packageName
        ))
        t.textViewUrunAd.text = urun.urun_adi
        t.textViewUrunFiyat.text = urun.urun_fiyat
        t.textViewUrunGram.text = urun.urun_gram

    }

    override fun getItemCount(): Int {

        return urunlerListesi.size
    }

}