package com.example.firebaseloginkotlin

import android.content.Intent as Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseloginkotlin.databinding.ActivityPopupLapizBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PopupLapizActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityPopupLapizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopupLapizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth
        auth = Firebase.auth

        binding.imageView10.setOnClickListener{
            val intent = Intent(this, PatronesBasicosActivity::class.java)
            startActivity(intent)
        }

    }



}