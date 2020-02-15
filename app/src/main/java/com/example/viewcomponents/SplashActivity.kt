package com.example.viewcomponents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        btnOpenMAinActivity.text = "ashshssj"
        btnOpenMAinActivity.setOnClickListener {

            //activityler arası geçiş yöntemi
            val intent = Intent(this, MainActivity::class.java)
            //intent ile veri taşıma

            //destecture
            val (keyName, keyAe, keyIsMale) = UserProfile("Tugba", 26, true)
            //struct yapısı ile taşıma şekli
            val userProfile = object {
                val keyName: String = "Tugba"
                val keyAge: Int = 26
                val keyIsMale: Boolean = true
            }

            intent.putExtra(UserProfileType.KEY_NAME.name, userProfile.keyName)

            //bundle ile veri taşıma *****Aşağıda verilen parametreleri Enum classtan aldık en verimli veri taşıma yöntemi
            val bundle = Bundle()
            bundle.putInt(UserProfileType.KEY_AGE.name, 26)
            bundle.putBoolean(UserProfileType.KEY_IS_MALE.name, true)

            intent.putExtras(bundle)

            startActivity(intent)
            finish()
        }
    }
}