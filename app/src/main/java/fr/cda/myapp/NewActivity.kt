package fr.cda.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        var action = intent.action

        var isUserView = intent.hasCategory("user")
        val extras: Bundle? = intent.extras
        val name = extras?.get("name")
        val age = extras?.get("age")

        Log.d(this.localClassName, name as String)
    }
}