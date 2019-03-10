package com.sys1yagi.safe_args_sample.ui.edit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import com.sys1yagi.safe_args_sample.R
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    val args: EditActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        id_edit.setText(args.id.toString())
        title_edit.setText(args.title)
    }
}
