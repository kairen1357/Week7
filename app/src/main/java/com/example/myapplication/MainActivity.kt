package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.doneButton.setonClickListener{
            updateNickname(it)
        }

        binding.nickname_text.setonClickListener{
            addNickName(it)
        }

//        findViewById<Button>(R.id.done_button).setOnClickListener{
//            addNickName(it)
//        }
//
//        findViewById<TextView>(R.id.nickname_text).setOnClickListener{
//            updateNickname(it)
//        }

    }

    private fun addNickName(view:View)
    {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView=findViewById<TextView>(R.id.nickname_text)

        binding.nicknameText.text=binding.nicknameEdit.text
        binding.nicknameEdit.visibility=View.GONE
        view.visibility= View.GONE
        binding.nicknameText.visibility = View.VISIBLE
    }

    private fun updateNickname(view:View)
    {
        val editText= findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<TextView>(R.id.nickname_text)

        editText.visibility=View.VISIBLE
        doneButton.visibility=View.VISIBLE
        view.visibility=view.GONE

        editText.requestFocus()

    }

}