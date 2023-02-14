package fr.cda.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        val profile:Profile = intent.getParcelableExtra("profile")!!
        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)
        nameTextView.setText("Nom : ${profile?.name}")
        ageTextView.setText("Age : ${profile?.age}")

    }
}