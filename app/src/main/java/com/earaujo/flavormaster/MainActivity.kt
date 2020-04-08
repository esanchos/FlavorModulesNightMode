package com.earaujo.flavormaster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.earaujo.licensemanager.SettingsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        setContentView(R.layout.activity_main)

        settingsImageView.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

//    private fun startActivityForResult(intent: Intent) {
//        recreate()
//    }

}
