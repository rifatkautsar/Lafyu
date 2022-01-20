package com.rifat.megaplex.ui.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        detailordercv.setOnClickListener {
            val intent = Intent(this, DetailOrderActivity::class.java)
            startActivity(intent)
        }
    }
}