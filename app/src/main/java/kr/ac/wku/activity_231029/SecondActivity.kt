package kr.ac.wku.activity_231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.activity_231029.databinding.ActivityMainBinding
import kr.ac.wku.activity_231029.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.btnBackButton.setOnClickListener {
            finish()
            //second activity에서
            //val myIntent = Intent(this, MainActivity::class.java)
            //startActivity(myIntent)는 화면을 새로 생성하는 것 이기 때문에 계속 메모리를 차지함 -> finish로 해야 꺼지고 원래 화면으로 돌아가 누수가 없다.
        }
    }
}