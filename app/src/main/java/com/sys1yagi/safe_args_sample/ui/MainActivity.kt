package com.sys1yagi.safe_args_sample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sys1yagi.safe_args_sample.R
import com.sys1yagi.safe_args_sample.ui.top.TopFragment
import com.sys1yagi.safe_args_sample.util.newFragmentInstance

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(
                    R.id.container,
                    newFragmentInstance<TopFragment>(),
                    TopFragment::class.java.name
                )
                .commit()
        }
    }
}
