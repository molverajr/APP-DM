package com.example.firebaseloginkotlin.activities

import android.content.Intent as Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseloginkotlin.databinding.ActivityPopupPanBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PopupPanActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityPopupPanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopupPanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth
        auth = Firebase.auth

        binding.imageView9.setOnClickListener{
            val intent = Intent(this, PatronesBasicosActivity::class.java)
            startActivity(intent)
        }
    }
}