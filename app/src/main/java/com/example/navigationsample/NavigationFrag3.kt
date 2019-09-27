package com.example.navigationsample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Created by Srikant Karnani on 25/9/19.
 */
class NavigationFrag3 : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.frag3_navigation, container, false)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(this.javaClass.name,"Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(this.javaClass.name,"ViewCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(this.javaClass.name,"ActivityCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.e(this.javaClass.name,"Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(this.javaClass.name,"Pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(this.javaClass.name,"Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(this.javaClass.name,"DestroyView")
    }

    override fun onStop() {
        super.onStop()
        Log.e(this.javaClass.name,"Stop")
    }

    override fun onStart() {
        super.onStart()
        Log.e(this.javaClass.name,"Start")
    }
}