package org.sopt24.dshyun0226.androidseminar.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_comment.*
import kotlinx.android.synthetic.main.toolbar_comment.*
import org.sopt24.dshyun0226.androidseminar.Adapter.CommentRecyclerViewAdapter
import org.sopt24.dshyun0226.androidseminar.Data.CommentData
import org.sopt24.dshyun0226.androidseminar.R

class CommentActivity : AppCompatActivity() {
    lateinit var commentRecyclerViewAdapter:CommentRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)

        configureTitleBar()
        configureRecyclerView()
    }

    private fun configureTitleBar(){
        btn_toolbar_comment_back.setOnClickListener {
            finish()
        }
    }

    private fun configureRecyclerView(){
        var dataList: ArrayList<CommentData> = ArrayList()
        dataList.add(CommentData(0,0,0,
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", "솝러버",
            "문어에 대한 내용이 아주 유익하네요. 추천드룡! 다들 꼭 보시길~^^", "19.03.25 23:21:38"))
        dataList.add(CommentData(0,0,0,
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", "솝맘",
            "타코야끼가 생각나는 웹툰이에요 :) 타코야끼 먹으면서 읽는 거 추천~!", "19.03.25 23:25:38"))
        dataList.add(CommentData(0,0,0,
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", "조총무",
            "심심할 때 할 게 없다면 이 웹툰을 읽어보세여!! _ 맑고 개끗한 조총무", "19.03.25 23:25:38"))
        dataList.add(CommentData(0,0,0,
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", "김스윗",
            "감동적인 이야기 입니다,,, 아주 스윗한 ㅇ웹툰이네요ㅠㅋㅋㅋㅋㅋ", "19.03.25 23:25:38"))

        txt_toolbar_comment_title.text = "댓글(" + dataList.size.toString() + ")"

        commentRecyclerViewAdapter = CommentRecyclerViewAdapter(this, dataList)
        rv_comment_list.adapter = commentRecyclerViewAdapter
        rv_comment_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_comment_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
