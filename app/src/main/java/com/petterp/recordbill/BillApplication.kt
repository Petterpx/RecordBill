package com.petterp.recordbill

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *
 * @author petterp
 */
class BillApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}
