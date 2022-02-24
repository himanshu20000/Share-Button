package com.example.share

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnshare = findViewById<Button>(R.id.shareBtn)

        btnshare.setOnClickListener {

            val shareBody = "link do qa"
            val shareSubject = "share kro"

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject)
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)

            startActivity(shareIntent)

        }
    }
}