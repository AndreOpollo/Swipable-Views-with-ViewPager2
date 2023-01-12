package com.example.swipableviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.health1,
            R.drawable.hungry1,
            R.drawable.img2,
            R.drawable.hungry2,
            R.drawable.ngo2,
            R.drawable.savings1
        )
      val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter= ViewPagerAdapter(images)
        viewPager.adapter = adapter
    }
}