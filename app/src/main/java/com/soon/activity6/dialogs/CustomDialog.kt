package com.soon.activity6.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import com.soon.activity6.databinding.DialogCustomBinding

class CustomDialog(context: Context) : Dialog(context) {

    lateinit var binding: DialogCustomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogCustomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        makeFullWidth()

        //binding.title.setText("This is the title")
        binding.save.setOnClickListener {
            // This closes the dialog. This is similar to "finish()" for activities.
            dismiss()
        }
    }

    private fun makeFullWidth() {
        val window: Window? = this.window
        window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}