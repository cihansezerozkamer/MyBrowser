package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListView listView = (ListView) findViewById(R.id.listView);
        PostAdapter adapter = new PostAdapter(this, posts);
        listView.setAdapter(adapter);
    }
}