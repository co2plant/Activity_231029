package kr.ac.wku.activity_231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.activity_231029.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding:ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

        val receivedMessage = intent.getStringExtra("message")
        //이전 화면에서 보내준 "message"라는 이름표가 붙어있는 String 추출
        binding.txtMessage.text = receivedMessage


        //Int는 String과 다르게 Java에서 기본형변수(프리미티브) 라 기본값이 null이 아니다.
        //String은 기본값이 null임
        //따라서 첨부가 안될때를 대비해서 기본값을 설정해주는 등의 노력을 해야함.
        val receivedNumber = intent.getIntExtra("number", -1)
        binding.txtMessage.text = "전달문구 : ${receivedMessage}\n전달숫자 : ${receivedNumber}"

    }
}