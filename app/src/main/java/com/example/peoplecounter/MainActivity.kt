package com.example.peoplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.peoplecounter.ui.theme.PeopleCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnclickme = findViewById<Button>(R.id.button)
        val tv=findViewById<TextView>(R.id.textView)
        var clicks:Int = 0

//       onButton using on click listener


        btnclickme.setOnClickListener {

            clicks +=1

            tv.text = "HEY YOU CLICK IT ........ ${clicks} "

            Toast.makeText(this,"Hey I am Umesh ${clicks}",Toast.LENGTH_LONG).show()
        }




    }
}

