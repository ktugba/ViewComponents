package com.example.viewcomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intent erişimi
        val name = intent.getStringExtra(UserProfileType.KEY_NAME.name)

        //bundle erişimi
        val age = intent.extras?.getInt(UserProfileType.KEY_AGE.name)
        val isMale = intent.extras?.getBoolean(UserProfileType.KEY_IS_MALE.name)

        txt1.text = "Name :$name, Age :$age, isMale : $isMale"

    }
}
