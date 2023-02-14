package fr.cda.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.start_new_activity_button)
        button.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", "Yazid")
            intent.putExtra("age", 25)
            startActivity(intent)
        }

        val buttonProfilActivity = findViewById<Button>(R.id.my_profile)
        buttonProfilActivity.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            val profile = Profile("Yazid", 26)
            intent.putExtra("profile", profile)
            startActivity(intent)
        }
        Log.v(this.localClassName, "Verbose message");
        Log.d(this.localClassName, "Debug message")
    }
}