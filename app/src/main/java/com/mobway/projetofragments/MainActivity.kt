package com.mobway.projetofragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobway.projetofragments.ui.PrimeiroFragment
import com.mobway.projetofragments.ui.SegundoFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container1, PrimeiroFragment.newInstance())
            .commitNow()

        supportFragmentManager.beginTransaction()
            .replace(R.id.container2, SegundoFragment.newInstance("", ""))
            .commitNow()

    }
}