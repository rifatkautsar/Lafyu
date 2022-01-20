package com.rifat.megaplex.ui.main.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.fragment_account.*

class FragmentAccount : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        detailaddresscv.setOnClickListener {
            activity?.let {
                val intent = Intent(it, AddressActivity::class.java)
                it.startActivity(intent)
            }
        }

        detailpaymentcv.setOnClickListener {
            activity?.let {
                val intent = Intent(it, PaymentActivity::class.java)
                it.startActivity(intent)
            }
        }

        detailprofilecv.setOnClickListener {
            activity?.let {
                val intent = Intent(it, ActivityProfile::class.java)
                it.startActivity(intent)
            }
        }

        ordermenucv.setOnClickListener {
            activity?.let {
                val intent = Intent(it, OrderActivity::class.java)
                it.startActivity(intent)
            }
        }
    }
}