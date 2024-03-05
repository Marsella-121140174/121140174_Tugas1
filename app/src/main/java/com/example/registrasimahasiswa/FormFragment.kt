package com.example.registrasimahasiswa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FormFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        // Inisialisasi komponen UI dan tambahkan event listener
        val btnSubmit = view.findViewById<Button>(R.id.btn_submit)
        btnSubmit.setOnClickListener {
            // Handle event klik tombol submit di sini
        }

        return view
    }
}
