package com.example.firebaseloginkotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseloginkotlin.R
import com.example.firebaseloginkotlin.ui.ui.main.VideosFragment

class VideosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_videos)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,VideosFragment())
                .commitNow()
        }
    }
}