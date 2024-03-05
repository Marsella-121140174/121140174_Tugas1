package com.example.registrasimahasiswa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.registrasimahasiswa.ui.theme.RegistrasiMahasiswaTheme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val gender = if (checkBoxMale.isChecked) "Laki-laki" else "Perempuan"
            val department = spinnerDepartment.selectedItem.toString()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("GENDER", gender)
            intent.putExtra("DEPARTMENT", department)
            startActivity(intent)
        }
    }
}
