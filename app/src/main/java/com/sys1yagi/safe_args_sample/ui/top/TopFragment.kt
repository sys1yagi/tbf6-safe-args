package com.sys1yagi.safe_args_sample.ui.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.sys1yagi.safe_args_sample.R
import kotlinx.android.synthetic.main.fragment_top.*

class TopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        open_detail.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_topFragment_to_detailFragment))
        open_edit.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_topFragment_to_detailFragment))
    }
}
