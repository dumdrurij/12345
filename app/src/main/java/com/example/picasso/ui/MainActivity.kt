package com.example.picasso.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.picasso.R

class MainActivity: AppCompatActivity(R.layout.activiti_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FirstFragment>(R.id.main_container)
            add<RadioWelcome>(R.id.welcome_container)
        }
    }


}
