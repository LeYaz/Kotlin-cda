package fr.cda.myapp

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class ConfirmationDeleteDialogFragment : DialogFragment() {
    val TAG = ConfirmationDeleteDialogFragment::class.java.simpleName

    interface ConfirmationDeleteListener{
        fun onDialogPositiveClick()
        fun onDialogNegativeClick()
    }

    var listener: ConfirmationDeleteListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        builder.setMessage("Supprimer tout le contenu")

            .setPositiveButton("oui", object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Log.i(TAG, "Ok t'es sur de toi")
                    listener?.onDialogPositiveClick()
                }
            })
            .setNegativeButton("Jamais", object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Log.i(TAG, "Pas de suppr")
                    listener?.onDialogNegativeClick()
                }
            })

        return builder.create()
    }


}