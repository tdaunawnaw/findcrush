package com.example.findcrush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findcrush.adapter.CrushAdapter
import com.example.findcrush.model.crush

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.crushrecycler)

        val crushArray=ArrayList<crush>()
        crushArray.add(crush(R.drawable.a1,"Park Shin Hye \nposted",R.drawable.p11))
        crushArray.add(crush(R.drawable.a2,"Crystal \nposted",R.drawable.pomegranate))

        val crushAdapter=CrushAdapter(crushArray)

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=crushAdapter
    }
}
