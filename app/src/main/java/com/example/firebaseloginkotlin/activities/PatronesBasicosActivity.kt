package com.example.firebaseloginkotlin.activities

import android.content.Intent as Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseloginkotlin.databinding.ActivityPatronesBasicosBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PatronesBasicosActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityPatronesBasicosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        binding = ActivityPatronesBasicosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth
        auth = Firebase.auth

        binding.Retorno.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.Ajo.setOnClickListener{
            val intent = Intent(this, PopupAjoloteActivity::class.java)
            startActivity(intent)
        }

        binding.Lapiz.setOnClickListener{
            val intent = Intent(this, PopupLapizActivity::class.java)
            startActivity(intent)
        }

        binding.Pan.setOnClickListener{
            val intent = Intent(this, PopupPanActivity::class.java)
            startActivity(intent)
        }

    }



}