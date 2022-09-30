package com.example.firebaseloginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseloginkotlin.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth
        auth = Firebase.auth

        binding.botoncuenta.setOnClickListener{
            val intent = Intent(this, UserAccount::class.java)
            startActivity(intent)
        }

        binding.botondatos.setOnClickListener{
            val intent = Intent(this, CuriousFactActivity::class.java)
            startActivity(intent)
        }
        
        binding.botonpatrones.setOnClickListener{
            val intent = Intent(this, PatronesBasicosActivity::class.java)
            startActivity(intent)
        }
        
        
    }

}