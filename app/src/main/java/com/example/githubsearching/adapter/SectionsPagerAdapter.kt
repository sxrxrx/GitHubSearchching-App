package com.example.githubsearching.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.githubsearching.fragment.FollowersFragment
import com.example.githubsearching.fragment.FollowingFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    var username: String? = null

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position) {
            0 -> fragment = FollowingFragment.newInstance(username!!)
            1 -> fragment = FollowersFragment.newInstance(username!!)
        }

        return fragment as Fragment
    }


}