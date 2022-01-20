package com.rifat.megaplex.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.rifat.megaplex.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homefragment = HomeFragment()
    private val explorefragment = ExploreFragment()
    private val cartFragment = FragmentCart()
    private val offerFragment = OfferFragment()
    private val accountFragment = FragmentAccount ()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homefragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homemenu -> replaceFragment(homefragment)
                R.id.exploremenu -> replaceFragment(explorefragment)
                R.id.cartmenu -> replaceFragment(cartFragment)
                R.id.offermenu -> replaceFragment(offerFragment)
                R.id.accountmenu -> replaceFragment(accountFragment)
            }
            true
        }

    }
    private fun replaceFragment (fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame1, fragment)
            transaction.commit()
        }

    }

}