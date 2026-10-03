package com.unidrop.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {

            startActivity(
                Intent(this, MainActivity::class.java)
            )

        }

        findViewById<TextView>(R.id.txtRegister).setOnClickListener {

            startActivity(
                Intent(this, RegisterActivity::class.java)
            )

        }
    }
}