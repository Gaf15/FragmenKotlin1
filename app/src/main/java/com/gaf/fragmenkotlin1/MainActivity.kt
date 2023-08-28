package com.gaf.fragmenkotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.ui.setupActionBarWithNavController


class MainActivity : AppCompatActivity() {

    val fragHome : Fragment = HomeFragment()
    val fragInfo : Fragment = InfoFragment()
    val fm : FragmentManager = supportFragmentManager
    val active  : Fragment = fragHome

    private lateinit var menu : Menu
    private lateinit var menuItem : MenuItem


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpNaviBottom()
    }

    private fun setUpNaviBottom() {
        fm.beginTransaction().add(R.id.navi_content, fragHome).show(fragHome).commit()
        fm.beginTransaction().add(R.id.navi_content, fragInfo).show(fragInfo).commit()

        menu = btn_navi_view.menu
        menuItem = menu.getItem(0)
        menuItem.isCheckable = true

        btn_navi_view.setOnNavigationItemSelectedListener {
            item ->
            when (item.itemId){

            }

        }



    }
}