package com.example.profil_bowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectActivity : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<ProjectData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager(this)

        list.add(
            ProjectData("Profil Guru", "tugas", "https://github.com/Bowosaktiw/profileGuru")
        )

        list.add(
            ProjectData(  "tugas",
                "profil guru",
                "https://github.com/Bowosaktiw/profileGuru")

        )


        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter

    }

}
