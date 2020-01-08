package com.example.songs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static int types;
    ImageView i0,i1,i2,i3,i4,i5,k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i0=(ImageView)findViewById(R.id.i1);
        i1=(ImageView)findViewById(R.id.i2);
        i2=(ImageView)findViewById(R.id.i3);
        i3=(ImageView)findViewById(R.id.i4);
        i4=(ImageView)findViewById(R.id.i5);
        i5=(ImageView)findViewById(R.id.i6);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.cheers);
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        i0.setImageDrawable(roundedBitmapDrawable);
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.chill2);
        RoundedBitmapDrawable roundedBitmapDrawable1= RoundedBitmapDrawableFactory.create(getResources(),bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        i1.setImageDrawable(roundedBitmapDrawable1);
        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(),R.drawable.classic2);
        RoundedBitmapDrawable roundedBitmapDrawable2= RoundedBitmapDrawableFactory.create(getResources(),bitmap2);
        roundedBitmapDrawable2.setCircular(true);
        i2.setImageDrawable(roundedBitmapDrawable2);
        Bitmap bitmap3= BitmapFactory.decodeResource(getResources(),R.drawable.lovenotes2);
        RoundedBitmapDrawable roundedBitmapDrawable3= RoundedBitmapDrawableFactory.create(getResources(),bitmap3);
        roundedBitmapDrawable3.setCircular(true);
        i3.setImageDrawable(roundedBitmapDrawable3);
        Bitmap bitmap4= BitmapFactory.decodeResource(getResources(),R.drawable.workout);
        RoundedBitmapDrawable roundedBitmapDrawable4= RoundedBitmapDrawableFactory.create(getResources(),bitmap4);
        roundedBitmapDrawable4.setCircular(true);
        i4.setImageDrawable(roundedBitmapDrawable4);
        Bitmap bitmap5= BitmapFactory.decodeResource(getResources(),R.drawable.party);
        RoundedBitmapDrawable roundedBitmapDrawable5= RoundedBitmapDrawableFactory.create(getResources(),bitmap5);
        roundedBitmapDrawable5.setCircular(true);
        i5.setImageDrawable(roundedBitmapDrawable5);
    }
    public void onClick(View v){
        types=v.getId();
        Intent i=new Intent(this,songlist.class);
        i.putExtra("types",v.getId());
        startActivity(i);
    }
}
