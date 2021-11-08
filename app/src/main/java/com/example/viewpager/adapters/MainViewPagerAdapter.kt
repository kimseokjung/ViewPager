package com.example.viewpager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.fragments.GreetingsFragment
import com.example.viewpager.fragments.MyInfoFragment
import com.example.viewpager.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 ->  NameFragment()
            1 -> MyInfoFragment()
            else -> GreetingsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 ->  "이름"
            1 -> "내 정보"
            else -> "인사말"
        }
    }
}