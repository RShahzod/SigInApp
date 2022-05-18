package uz.shox.siginapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        countDownTimer()


    }

    private fun countDownTimer() {
        object : CountDownTimer(2000,1000){
            override fun onTick(p0: Long) {

            }
            override fun onFinish() {
             callActivity()
            }
        }.start()
    }
    fun callActivity(){
        val intent = Intent(this,SigInActivity::class.java)
        startActivity(intent)
        finish()
    }

}