package org.sopt24.dshyun0226.androidseminar.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.widget.GridLayout
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_product.*
import kotlinx.android.synthetic.main.toolbar_product.*
import org.sopt24.dshyun0226.androidseminar.Adapter.EpisodeOverviewRecyclerViewAdapter
import org.sopt24.dshyun0226.androidseminar.Adapter.ProductOverviewRecyclerViewAdapter
import org.sopt24.dshyun0226.androidseminar.Data.EpisodeOverviewData
import org.sopt24.dshyun0226.androidseminar.R

class ProductActivity : AppCompatActivity() {

    lateinit var episodeOverviewRecyclerViewAdapter:EpisodeOverviewRecyclerViewAdapter
    lateinit var title: String
    var product_id: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        configureTitleBar()
        configureRecyclerView()
    }

    private fun configureTitleBar(){
        title = intent.getStringExtra("title")
        product_id = intent.getIntExtra("idx", -1)
        if(product_id == -1) finish()

        txt_toolbar_product_title.text = title

        btn_toolbar_product_like.setOnClickListener {
            btn_toolbar_product_like.isSelected = !btn_toolbar_product_like.isSelected
        }

        btn_toolbar_product_back.setOnClickListener {
            finish()
        }
    }

    private fun configureRecyclerView() {
        var dataList: ArrayList<EpisodeOverviewData> = ArrayList()
        dataList.add(
            EpisodeOverviewData(
                product_id, 0, "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                "에피소드 1", 1, "2019-04-01"))
        dataList.add(
            EpisodeOverviewData(
                product_id, 1, "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                "에피소드 2", 10, "2019-04-02"))
        dataList.add(
            EpisodeOverviewData(
                product_id, 2, "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                "에피소드 3", 100, "2019-04-03"))
        dataList.add(
            EpisodeOverviewData(
                product_id, 3, "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                "에피소드 4", 1000, "2019-04-04"))
        dataList.add(
            EpisodeOverviewData(
                product_id, 4, "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                "에피소드 5", 10000, "2019-04-05"))

        episodeOverviewRecyclerViewAdapter = EpisodeOverviewRecyclerViewAdapter(this, dataList)
        rv_episode_overview_list.adapter = episodeOverviewRecyclerViewAdapter
        rv_episode_overview_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
}

