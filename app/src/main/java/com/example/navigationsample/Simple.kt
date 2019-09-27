package com.example.navigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Simple : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_fragment)
        supportFragmentManager.beginTransaction().add(R.id.simple_fragment_container, SimpleFrag1()).commit()
    }
}
