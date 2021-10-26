package com.zqy.colorstatelistdemo

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/**
 * @author ZQY
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ColorStateInit()
    }

    fun ColorStateInit(){
        val mTextView:TextView=findViewById(R.id.text)
        val colorStateList:ColorStateList=getColorStateList(R.color.colorstate_text)
        mTextView.setTextColor(colorStateList)
    }
}