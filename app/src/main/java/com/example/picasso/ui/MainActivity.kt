
package com.example.picasso.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OneShotPreDrawListener.add
import androidx.fragment.app.add
import androidx.fragment.app.commit


import com.example.picasso.R
import com.example.picasso.ui.FirstFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FirstFragment>(R.id.main_container)
        }
    }
}