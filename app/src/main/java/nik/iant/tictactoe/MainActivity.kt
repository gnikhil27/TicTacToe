package nik.iant.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    fun getXO(string: String):String{
        if(string.isNullOrBlank())
            return "X"
        else return "O"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            var a = findViewById<Button>(R.id.btn1).text.toString().toFloat()

            // static int a;
            var btnArr = arrayOf(
                    findViewById<Button>(R.id.btn1),
                    findViewById<Button>(R.id.btn2),
                    findViewById<Button>(R.id.btn3),
                    findViewById<Button>(R.id.btn4),
                    findViewById<Button>(R.id.btn5),
                    findViewById<Button>(R.id.btn6),
                    findViewById<Button>(R.id.btn7),
                    findViewById<Button>(R.id.btn8),
                    findViewById<Button>(R.id.btn9),
            )
            for(i in btnArr)
                i.setOnClickListener { i.setOnClickListener { i.setText(getXO(i.text.toString())) } }
        }catch (ex: Exception){
            Toast.makeText(this, "Error: " + ex.message, Toast.LENGTH_LONG).show()
        }

    }
}