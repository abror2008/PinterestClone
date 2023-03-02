package com.example.pinterestclone.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.pinterestclone.R
import com.example.pinterestclone.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MessageFragment : Fragment(R.layout.fragment_message) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }
    private fun initViews(view: View) {
        val viewPager= view.findViewById<ViewPager>(R.id.viewPager)
        val tabLayout=view.findViewById<TabLayout>(R.id.tabLayout)
        val adapter=ViewPagerAdapter(requireActivity().supportFragmentManager)
        val updatesFragment=UpdatesFragment()
        val messageInMessageFragment=MessageInMessageFragment()
        adapter.addFragment("Обновления",updatesFragment)
        adapter.addFragment("Сообщение",messageInMessageFragment)
        viewPager.adapter=adapter
        tabLayout.setupWithViewPager(viewPager)

    }
}