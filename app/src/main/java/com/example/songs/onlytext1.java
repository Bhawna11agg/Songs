package com.example.songs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onlytext1 extends AppCompatActivity {
    Button btnn;
    MediaPlayer mp1;
    int x, position, types, flag = 1;
    int[] audio1 = {
            R.raw.akh_lad, R.raw.coca_cola, R.raw.lal_ghaghra, R.raw.party44, R.raw.lamborgini, R.raw.lak_mera, R.raw.akhiyon_se
    };
    int[] audio2 = {
            R.raw.coca_cola, R.raw.lal_ghaghra, R.raw.party44, R.raw.lamborgini, R.raw.lak_mera, R.raw.akhiyon_se
    };
    int[] audio3 = {
            R.raw.kajra1, R.raw.aaj_koi, R.raw.tere_bin_saas, R.raw.lak_mera, R.raw.akhiyon_se
    };
    int[] audio4 = {
            R.raw.kinna_song1, R.raw.ve_maahi1, R.raw.yaad_piya1, R.raw.sanu_ek_pal, R.raw.akh_lad, R.raw.coca_cola, R.raw.tere_bin_saas, R.raw.lal_ghaghra
    };
    int[] audio5 = {
            R.raw.zumba, R.raw.party44, R.raw.lamborgini, R.raw.lak_mera, R.raw.akhiyon_se
    };
    int[] audio6 = {
            R.raw.o_saaki1, R.raw.ishaare1, R.raw.party1, R.raw.coca_cola
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlytext1);
        Intent in = getIntent();
        position = in.getIntExtra("position", 0);
        btnn = findViewById(R.id.but);
        types = MainActivity.types;
        if (types == R.id.btn1) {
            mp1 = MediaPlayer.create(this, audio1[position]);
            x = audio1.length;
            mp1.start();
        }
        if (types == R.id.btn2) {
            mp1 = MediaPlayer.create(this, audio2[position]);
            x = audio2.length;
            mp1.start();
        }
        if (types == R.id.btn3) {
            mp1 = MediaPlayer.create(this, audio3[position]);
            x = audio3.length;
            mp1.start();
        }
        if (types == R.id.btn4) {
            mp1 = MediaPlayer.create(this, audio4[position]);
            x = audio4.length;
            mp1.start();
        }
        if (types == R.id.btn5) {
            mp1 = MediaPlayer.create(this, audio5[position]);
            x = audio5.length;
            mp1.start();
        }
        if (types == R.id.btn6) {
            mp1 = MediaPlayer.create(this, audio6[position]);
            x = audio6.length;
            mp1.start();
        }
        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                playlist();
            }
        });
    }

    public void playlist() {
        position++;
        if (position == x) {
            position = 0;
        }
        if (types == R.id.btn1) {
            mp1 = MediaPlayer.create(this, audio1[position]);
            x = audio1.length;
        }
        if (types == R.id.btn2) {
            mp1 = MediaPlayer.create(this, audio2[position]);
            x = audio2.length;
        }
        if (types == R.id.btn3) {
            mp1 = MediaPlayer.create(this, audio3[position]);
            x = audio3.length;
        }
        if (types == R.id.btn4) {
            mp1 = MediaPlayer.create(this, audio4[position]);
            x = audio4.length;
        }
        if (types == R.id.btn5) {
            mp1 = MediaPlayer.create(this, audio5[position]);
            x = audio5.length;
        }
        if (types == R.id.btn6) {
            mp1 = MediaPlayer.create(this, audio6[position]);
            x = audio6.length;
        }
        mp1.start();

        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                playlist();
            }
        });
    }

    public void onClickClick(View v) {
       flag++;
        if (flag % 2 != 0) {
            mp1.start();
            btnn.setText("Pause");
        }

        if (flag % 2 == 0) {
            mp1.pause();
            btnn.setText("Play");
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (mp1.isPlaying()) {
            mp1.stop();
        }
    }
}



