package com.rifat.megaplex.ui.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.activity_address.*
import kotlinx.android.synthetic.main.activity_address2.*

class AddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address2)

        btneditaddress.setOnClickListener {
            val intent = Intent(this, AddAddressActivity::class.java)
            startActivity(intent)
        }
    }
}