package kr.ac.wku.activity_231029

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.activity_231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnMoveToSecond.setOnClickListener {
            //버튼이 눌리면 화면을 Second Activity로 이동
            val myIntent = Intent(this, SecondActivity::class.java)

            startActivity(myIntent)
        }

        binding.btnMoveToThird.setOnClickListener {
            val myIntent = Intent(this, ThirdActivity::class.java)

            //화면 이동 전에 데이터를 myIntent에 첨부
            val inputMessage = binding.edtMessage.text.toString()
            myIntent.putExtra("message", inputMessage) //message는 그냥 이름이고 실제 전달되는건 inputMessage

            //edtNumber에 적힌 값도 Int로 변환해서 첨부
            val inputNumber = binding.edtNumber.text.toString().toInt()
            myIntent.putExtra("number", inputNumber)
            startActivity(myIntent)
        }

        binding.btnPhoneCall.setOnClickListener{
            val inputPhoneNum = binding.edtPhoneCall.text.toString()

            val myUri = Uri.parse("tel:${inputPhoneNum}")

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)
        }
    }
}