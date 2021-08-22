package com.petterp.recordbill.util

import android.app.Activity
import android.content.Context
import android.content.Intent

inline fun <reified C : Class<*>> Context.startActivity() {
    val intent = Intent(this, C::class.java)
    startActivity(intent)
}

inline fun <reified C : Activity> Context.intent() = Intent(this, C::class.java)
