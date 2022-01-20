package com.rifat.megaplex.ui.main.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment  : Fragment()  {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        cvflashsale.setOnClickListener {
            activity?.let{
                val intent = Intent (it, DetailActivity::class.java)
                it.startActivity(intent)
            }
        }
    }
}