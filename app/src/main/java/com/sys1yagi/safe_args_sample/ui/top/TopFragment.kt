package com.sys1yagi.safe_args_sample.ui.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sys1yagi.safe_args_sample.R
import com.sys1yagi.safe_args_sample.ui.detail.DetailFragment
import com.sys1yagi.safe_args_sample.ui.detail.DetailFragmentArgs
import com.sys1yagi.safe_args_sample.ui.edit.EditActivity
import com.sys1yagi.safe_args_sample.ui.edit.EditActivityArgs
import com.sys1yagi.safe_args_sample.util.newActivityIntent
import com.sys1yagi.safe_args_sample.util.newFragmentInstance
import kotlinx.android.synthetic.main.fragment_top.*

class TopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        open_detail.setOnClickListener {
            requireFragmentManager()
                .beginTransaction()
                .replace(
                    R.id.container,
                    newFragmentInstance<DetailFragment>(
                        DetailFragmentArgs(
                            id = 10,
                            title = "Navigation Sample!"
                        ).toBundle()
                    ),
                    DetailFragment::class.java.name
                )
                .addToBackStack(DetailFragment::class.java.name)
                .commit()
        }
        open_edit.setOnClickListener {
            newActivityIntent<EditActivity>(
                requireContext(),
                EditActivityArgs(
                    id = 11,
                    title = "Navigation!"
                ).toBundle()
            ).also {
                startActivity(it)
            }
        }
    }
}
