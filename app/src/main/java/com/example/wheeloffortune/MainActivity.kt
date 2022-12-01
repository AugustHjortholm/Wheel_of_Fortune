package com.example.wheeloffortune

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //TODO score
    //TODO UserInfo
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInformation = UserInformation()
        val scoreText = findViewById<TextView>(R.id.scoreText)
        scoreText.text = "Score: ${userInformation.score}"

        val btnStartGame = findViewById<Button>(R.id.startGame)
        btnStartGame.setOnClickListener {
            val intent = Intent(this, ChooseCategoryActivity::class.java)
            intent.putExtra("user_information", userInformation)
            startActivity(intent)

        }
        val btnResetScore = findViewById<Button>(R.id.resetScore)
        btnResetScore.setOnClickListener{
            userInformation.score = 0
            scoreText.text = "Score: ${userInformation.score}"
        }
    }
}