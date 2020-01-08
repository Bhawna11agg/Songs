package com.example.songs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class song1 extends AppCompatActivity {
    Button btn;
    TextView txt;
    ImageView img;
    int count;
    MediaPlayer mp;
    int[] audio1 = {
R.raw.akh_lad,R.raw.coca_cola,R.raw.lal_ghaghra,R.raw.party44,R.raw.lamborgini,R.raw.lak_mera,R.raw.akhiyon_se
    };
    int[] audio2 = {
  R.raw.coca_cola,R.raw.lal_ghaghra,R.raw.party44,R.raw.lamborgini,R.raw.lak_mera,R.raw.akhiyon_se
    };
    int[] audio3 = {
           R.raw.kajra1,R.raw.aaj_koi,R.raw.tere_bin_saas,R.raw.lak_mera,R.raw.akhiyon_se
    };
    int[] audio4 = {
            R.raw.kinna_song1, R.raw.ve_maahi1,R.raw.yaad_piya1,R.raw.sanu_ek_pal,R.raw.akh_lad,R.raw.coca_cola,R.raw.tere_bin_saas,R.raw.lal_ghaghra
    };
    int[] audio5 = {
R.raw.zumba,R.raw.party44,R.raw.lamborgini,R.raw.lak_mera,R.raw.akhiyon_se
    };
    int[] audio6 = {
         R.raw.o_saaki1,R.raw.ishaare1,R.raw.party1,R.raw.coca_cola
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        txt=findViewById(R.id.textView);
        img=findViewById(R.id.imagetransfer);
        btn=findViewById(R.id.buttonu);
        Intent intent1=getIntent();
        String visible=intent1.getStringExtra("visible");
        int visible2=intent1.getIntExtra("visible2",0);
        int position=intent1.getIntExtra("position",0);
        int types=MainActivity.types;
        if(types==R.id.btn1)
        mp=MediaPlayer.create(this,audio1[position]);
        if(types==R.id.btn2)
            mp=MediaPlayer.create(this,audio2[position]);
        if(types==R.id.btn3)
            mp=MediaPlayer.create(this,audio3[position]);
        if(types==R.id.btn4)
            mp=MediaPlayer.create(this,audio4[position]);
        if(types==R.id.btn5)
            mp=MediaPlayer.create(this,audio5[position]);
        if(types==R.id.btn6)
            mp=MediaPlayer.create(this,audio6[position]);
        txt.setText(visible);
        img.setImageResource(visible2);
    }
    public void onClick1(View v) {
        count++;
        if(count%2!=0) {
            mp.start();
            btn.setText("Pause");
        }

        if(count%2==0) {
            mp.pause();
            btn.setText("Play");
        }
    }
    public void onBackPressed(){
        super.onBackPressed();
        if(mp.isPlaying()){
            mp.stop();
        }
    }
}
