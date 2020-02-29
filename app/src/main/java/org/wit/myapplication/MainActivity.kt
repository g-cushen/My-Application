package org.wit.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_text)
            Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show()
        }
    }
}
