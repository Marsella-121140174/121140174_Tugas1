package com.example.registrasimahasiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val name = intent.getStringExtra("NAME")
        val gender = intent.getStringExtra("GENDER")
        val department = intent.getStringExtra("DEPARTMENT")

        textViewName.text = "Nama: $name"
        textViewGender.text = "Jenis Kelamin: $gender"
        textViewDepartment.text = "Jurusan: $department"
    }
}
