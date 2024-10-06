package com.nudriin.myflexiblefragment

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager // membuat fragment manager
        val homeFragment = HomeFragment() // mengambil home fragment
        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName) //

        // Cek apakah fragmentnnya HomeFragment
        if(fragment !is HomeFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name : " + HomeFragment::class.java.simpleName)
            fragmentManager
                .beginTransaction()
                .add(R.id.frame_container, homeFragment, HomeFragment::class.java.simpleName) // memasukan fargment ke activity main
                .commit()
        }
    }
}