package com.example.navigationsample

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkBuilder
import kotlinx.android.synthetic.main.frag2_simple.*

/**
 * Created by Srikant Karnani on 25/9/19.
 */
class SimpleFrag2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(this.javaClass.name, "CreateView")
        return inflater.inflate(R.layout.frag2_simple, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(this.javaClass.name, "Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create the NotificationChannel
            val name = "deeplink"
            val descriptionText = "deeplink"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val mChannel = NotificationChannel("1", name, importance)
            mChannel.description = descriptionText
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            val notificationManager =
                context!!.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(mChannel)
        }

        deeplink_btn.setOnClickListener {
            var args = Bundle()
            args.putString("text", "hello")
            val deeplink = NavDeepLinkBuilder(context!!)
                .setComponentName(Navigation::class.java)
                .setGraph(R.navigation.nav_graph)
                .setDestination(R.id.navigationFrag3)
                .setArguments(args)
                .createPendingIntent()
            val notificationManager =
                context!!.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                notificationManager.createNotificationChannel(
                    NotificationChannel(
                        "1", "Deep Links", NotificationManager.IMPORTANCE_HIGH
                    )
                )
            }
            val builder = NotificationCompat.Builder(
                context!!, "1"
            )
                .setContentTitle("Navigation")
                .setContentText("Deep link to Android")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentIntent(deeplink)
                .setAutoCancel(true)
            notificationManager.notify(0, builder.build())
        }
        Log.e(this.javaClass.name, "ViewCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(this.javaClass.name, "ActivityCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.e(this.javaClass.name, "Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(this.javaClass.name, "Pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(this.javaClass.name, "Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(this.javaClass.name, "DestroyView")
    }

    override fun onStop() {
        super.onStop()
        Log.e(this.javaClass.name, "Stop")
    }

    override fun onStart() {
        super.onStart()
        Log.e(this.javaClass.name, "Start")
    }
}