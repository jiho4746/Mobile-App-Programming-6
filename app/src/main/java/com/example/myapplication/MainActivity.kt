package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //[방법 2] View 바인딩 (방법 1보다 간단)
        //build.gradle(Module)에 viewBinding=true를 해줘야 함
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.visibility = View.INVISIBLE
        binding.button2.visibility = View.INVISIBLE

        /* 방법 1
        setContentView(R.layout.activity_main)
        //변수 tv1은 TextView이며 findViewById를 통해 연결
        val tv1 : TextView = findViewById(R.id.textView)
        //val tv1 = findViewById<TextView>(R.id.textView)

        val rbar : RatingBar = findViewById(R.id.ratingBar)
        val btn : Button = findViewById(R.id.button2)
        val cnb : CheckBox = findViewById(R.id.checkBox2)
        val rdo : RadioButton = findViewById(R.id.radioButton4)

        //xml에서 android:visibility = "invisible"로도 설정할 수 있음
        //kt에서도 변경할 수 있음 (invisible:보이지 않음, 자리 차지 / gone:보이지 않음, 자리 차지 없음)
        tv1.visibility = View.INVISIBLE
`       */

        Log.d("myCheck", "안드로이드 시작-로그출력")
    }
}