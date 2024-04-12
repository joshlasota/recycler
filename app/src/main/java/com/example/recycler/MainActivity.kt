package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recycler.adapter.MyAdapter
import com.example.recycler.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    lateinit var staggered: StaggeredGridLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)
        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
            recyclerView.layoutManager = gridLayoutManager
        recyclerView.layoutManager = staggered
        recyclerView.setHasFixedSize(true)

        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter

    }


    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.image1, "Image 1"))
        items.add(MyModel(R.drawable.image2, "Image 2"))
        items.add(MyModel(R.drawable.image3, "Image 3"))
        items.add(MyModel(R.drawable.image4, "Image 4"))
        items.add(MyModel(R.drawable.image5, "Image 5"))
        items.add(MyModel(R.drawable.image6, "Image 6"))
        items.add(MyModel(R.drawable.image7, "Image 7"))
        items.add(MyModel(R.drawable.image8, "Image 8"))
        items.add(MyModel(R.drawable.image9, "Image 9"))
        items.add(MyModel(R.drawable.image10, "Image 10"))
        items.add(MyModel(R.drawable.image11, "Image 11"))
        items.add(MyModel(R.drawable.image12, "Image 12"))
        items.add(MyModel(R.drawable.image13, "Image 13"))
        items.add(MyModel(R.drawable.image14, "Image 14"))
        items.add(MyModel(R.drawable.image15, "Image 15"))
        items.add(MyModel(R.drawable.image16, "Image 16"))
        items.add(MyModel(R.drawable.image17, "Image 17"))
        items.add(MyModel(R.drawable.image18, "Image 18"))
        items.add(MyModel(R.drawable.image19, "Image 19"))
        items.add(MyModel(R.drawable.image20, "Image 20"))
        items.add(MyModel(R.drawable.image21, "Image 21"))
        items.add(MyModel(R.drawable.image22, "Image 22"))
        items.add(MyModel(R.drawable.image23, "Image 23"))
        items.add(MyModel(R.drawable.image24, "Image 24"))
        items.add(MyModel(R.drawable.image25, "Image 25"))


        return items
    }
}