package com.sys1yagi.safe_args_sample.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment

inline fun <reified T : Activity> newActivityIntent(context: Context, extras: Bundle? = null): Intent {
    return Intent(context, T::class.java).apply {
        extras?.let {
            putExtras(it)
        }
    }
}
