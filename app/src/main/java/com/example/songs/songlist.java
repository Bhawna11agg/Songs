package com.example.songs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class songlist extends AppCompatActivity {
    String[] lang = {
            "Bhawna", "Khushi"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songlist);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.my_recycler_view1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        int[] image = {
                R.drawable.cheers, R.drawable.chill
        };
        recyclerView1.setAdapter(new Adapter(lang, image));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        String[] lang1 = {
                "Bhawna", "Khushi"
        };
        int[] image1 = {
                R.drawable.cheers, R.drawable.chill
        };
        recyclerView.setAdapter(new Adapter(lang, image));

    }
  public void onClick(AdapterView<?>parent,View view,int position,long id){

        Intent intent=new Intent(this,song1.class);
        startActivity(intent);
  }

}
