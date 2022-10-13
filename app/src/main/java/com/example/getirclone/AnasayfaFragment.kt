package com.example.getirclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirclone.databinding.FragmentAnasayfaBinding
import com.google.android.material.tabs.TabLayout

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)
        var urunlerListesi = ArrayList<Urunler>()
        var u1 = Urunler(1,"21,99₺","Kızılay Erzincan","6 x 200 ml","kizilay")
        var u2 = Urunler(2,"7,99₺","Ülker Biskrem","100 gr","biskrem")
        var u3 = Urunler(3,"38,60₺","Toblerone","100 gr","toblerone")
        var u4 = Urunler(4,"11,99₺","Ülker Dido","3 x 35 gr","dido")
        var u5 = Urunler(5,"25,30₺","Milka Oreo","100 gr","milka")
        var u6 = Urunler(6,"13,99₺","İçim Ayran","1000ml","ayran")
        var u7 = Urunler(7,"11,30₺","Green Life Karanfil","20 gr","karanfil")
        var u8 = Urunler(8,"16,99₺","Lays Klasik","160 gr","lays")
        var u9 = Urunler(9,"32,99₺","Pringles Acılı","160 gr","pringles")
        var u10 = Urunler(10,"8,40₺","Olala BOLD","32 gr","olala")
        var u11 = Urunler(11,"16,99₺","Ruffles Klasik","120 gr","ruffles")
        var u12 = Urunler(12,"12,99₺","Uno Sandviç Ekmeği","280 gr","uno")
        tasarim.toolbar.title = "Ürünler"
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        urunlerListesi.add(u8)
        urunlerListesi.add(u9)
        urunlerListesi.add(u10)
        urunlerListesi.add(u11)
        urunlerListesi.add(u12)


        tasarim.rv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        val adapter = UrunlerAdapter(requireContext(),urunlerListesi)
        tasarim.rv.adapter = adapter







        return tasarim.root
    }

}