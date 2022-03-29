package com.example.fintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fintech.home.HomeFragment
import com.example.fintech.profile.ProfilFragment
import com.example.fintech.setting.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var btnHome : Button
    private lateinit var btnProfil : Button
    private lateinit var btnSetting : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById<Button>(R.id.btnHome)
        btnProfil = findViewById<Button>(R.id.btnProfil)
        btnSetting = findViewById<Button>(R.id.btnSettiing)

        btnHome.setOnClickListener { loadFragment(HomeFragment()) }
        btnProfil.setOnClickListener { loadFragment(ProfilFragment()) }
        btnSetting.setOnClickListener { loadFragment(SettingFragment()) }

    }

    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commitNow()
    }
}
