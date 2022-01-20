package com.rifat.megaplex.ui.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.product_detail.*
import java.util.*

class DetailActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail)

        setSupportActionBar(toolbarproductdetail)
        Objects.requireNonNull(supportActionBar?.setDisplayHomeAsUpEnabled(false))

    }

}