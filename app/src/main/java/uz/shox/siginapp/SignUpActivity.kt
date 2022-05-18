package uz.shox.siginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signInTxt = findViewById<TextView>(R.id.signInTxt)
        signInTxt.setOnClickListener {
            startActivity(Intent(this,SigInActivity::class.java))
            finish()
        }
    }
}