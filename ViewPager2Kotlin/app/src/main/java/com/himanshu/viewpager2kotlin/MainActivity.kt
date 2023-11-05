package com.himanshu.viewpager2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager2 : ViewPager2 = findViewById(R.id.viewPager2)
        val tablayout: TabLayout = findViewById(R.id.tabLayout)

        val images = listOf(
            R.drawable.buterflies,
            R.drawable.chamomile,
            R.drawable.flower,
            R.drawable.leaf,
            R.drawable.leaves,
            R.drawable.summer,
            R.drawable.tulips,
        )

        val adapter = ViewPagerAdpater(images)
        viewPager2.adapter = adapter

//        viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL

        TabLayoutMediator(tablayout, viewPager2 ){ tab, position ->
            tab.text = "Tab ${position +1}"
            tab.badge
        }.attach()








    }
}