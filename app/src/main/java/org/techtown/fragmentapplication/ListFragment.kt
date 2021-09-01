package org.techtown.fragmentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ListFragment : Fragment() {
    override fun onCreateView(    //savedInstanceState는 상태 값 저장을 위한 보조도구입니다. 액티비티의 onCreate의 파라미터와 동일하게 동작합니다.
        inflater: LayoutInflater, container: ViewGroup?, //inflate는 레이아웃 파일을 로드하기 위한 레이아웃 인플레이터를 기본으로 제공
        savedInstanceState: Bundle? //container는 프래그먼트 레이아웃이 배치되는 부모 레이아웃입니다.(액티비티의 레이아웃)
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }
}