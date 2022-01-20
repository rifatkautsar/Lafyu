package com.rifat.megaplex.ui.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tvsignin.setOnClickListener {
            val intent =  Intent(this, LoginActivity::class.java )
            startActivity(intent)
        }
    }
}