package com.oceanbrasil

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d("FIREBASE_MESSAGING","New Token:$token")
    }
}