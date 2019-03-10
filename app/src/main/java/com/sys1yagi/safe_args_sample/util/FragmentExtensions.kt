package com.sys1yagi.safe_args_sample.util

import android.os.Bundle
import androidx.fragment.app.Fragment

inline fun <reified T : Fragment> newFragmentInstance(args: Bundle? = null): T {
    return T::class.java.newInstance().apply {
        arguments = args
    }
}
