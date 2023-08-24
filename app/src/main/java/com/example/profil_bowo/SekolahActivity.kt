package com.example.profil_bowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {

    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<sekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager(this)

        list.add(sekolahData("SDN Kalisari 3", " JL.Kalisari, kec. sayung, kab. demak"))
        list.add(sekolahData("SMPN 1 Sayung", " JL.sayung, kec. sayung, kab. demak"))
        list.add(sekolahData("SMKN 1 Sayung", " Jl. Semarang-Demak km. 14 onggorawe"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}
