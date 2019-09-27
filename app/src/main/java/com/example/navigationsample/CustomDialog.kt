package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

/**
 * Created by Srikant Karnani on 27/9/19.
 */
class CustomDialog : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return inflater.inflate(R.layout.custom_dialog, container, false)
    }
}