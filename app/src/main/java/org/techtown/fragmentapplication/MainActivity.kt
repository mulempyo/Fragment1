package org.techtown.fragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {  //레이아웃에 접근을 안하기 때문에 바인딩 관련 코드는 작성 안합니다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment()
    }

    fun setFragment(){
       // val listFragment : ListFragment = ListFragment()
        //val transaction = supportFragmentManager.beginTransaction()
        //transaction.add(R.id.frameLayout, listFragment)
       // transaction.commit()
    }
}