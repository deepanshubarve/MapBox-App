package com.example.vyoriustestassingment

import com.mapbox.android.core.permissions.PermissionsManager
import java.lang.ref.WeakReference

class LocationPermissionHelper(val activity: WeakReference<MainActivity>) {
    lateinit var permissionsManager: PermissionsManager





    fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {

    }
}


