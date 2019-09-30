package com.example.navigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_navigation.*

class Navigation : AppCompatActivity() {

    lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        val navController = findNavController(this, R.id.navigation_frag)
        appBarConfiguration = AppBarConfiguration(navController.graph)


        // ActionBar
        setupActionBarWithNavController(navController, appBarConfiguration)

        //BottomNav

        bottom_appbar.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(this, R.id.navigation_frag)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}
