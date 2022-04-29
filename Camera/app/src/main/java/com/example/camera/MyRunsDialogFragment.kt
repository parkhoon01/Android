package com.example.camera

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyRunsDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val id = requireArguments().getInt("id")
        val parent: Activity? = activity
        return when(id) {
            ID_PHOTO_PICKER_FROM_CAMERA -> {
                val builder = AlertDialog.Builder(parent!!)
                builder.setTitle(R.string.ui_profile_photo_picker_title)
                val click = DialogInterface.OnClickListener{ dialogInterface, i ->
                    (parent as MainActivity?)?.onPhotoPickerItemSelected(i) }
                builder.setItems(R.array.ui_profile_photo_picker_items, click)
                builder.create()
            }
            else -> {
                val builder = AlertDialog.Builder(parent!!)
                builder.setTitle("Unknown")
                builder.create()
            }
        }
    }
    companion object{
        const val ID_PHOTO_PICKER_FROM_CAMERA = 0
        fun newInstance(id: Int): MyRunsDialogFragment{
            val fragment = MyRunsDialogFragment();
            val args = Bundle()
            args.putInt("id", id)
            fragment.arguments = args
            return fragment
        }
    }
}