package com.anwarkamel.mylogin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        startAnim()


    }

    private fun startAnim() {
        val  ttb = AnimationUtils.loadAnimation(this , R.anim.ttb)
        val  stb = AnimationUtils.loadAnimation(this , R.anim.stb)
        val  btt = AnimationUtils.loadAnimation(this , R.anim.btt)
        val  btt2 = AnimationUtils.loadAnimation(this , R.anim.btt2)








        textAnim.startAnimation(ttb)

        edt_email.startAnimation(stb)
        edt_pass.startAnimation(stb)

        btn_signup.startAnimation(btt)
        btn_signin.startAnimation(btt)

        tv_forgot_pass.startAnimation(btt2)


    }


}
