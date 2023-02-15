package fr.cda.myapp

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class FileListDialogFragment : DialogFragment() {
    val TAG = FileListDialogFragment::class.java.simpleName

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity?.layoutInflater

        builder.setView(inflater?.inflate(R.layout.dialog_file, null))
            .setPositiveButton("Supprimer", DialogInterface.OnClickListener { dialogInterface, i ->
                Log.i(TAG, "Suppression en cours ")
            })
            .setNegativeButton("Annuler", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            .setTitle("Contenu supprimé")
        return builder.create()
    }
}