package com.k3kc.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named


class AuthActivity : DaggerAppCompatActivity() {

    //val TAG: String = "AuthActivity"

    @Inject
    @JvmField
    //@field:Named("someString")
    var someString: String? = null

    @Inject
    @JvmField
    //@field:Named("hello")
    var hello: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("AAA", "onCreate: $someString $hello")
    }
}