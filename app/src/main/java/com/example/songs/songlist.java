package com.example.songs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class songlist extends AppCompatActivity{

    String[] lang1 = {
            "Akh Lad Jaave","Coca Cola Tu","Laal Ghaghra","Illegal Weapon","Lamborgini","Lak Mera","Akhiyon se goli Maare"
    };
    String[] lang2 ={
            "Coca Cola Tu","Laal Ghaghra","Illegal Weapon","Lamborgini","Lak Mera","Akhiyon se goli Maare"
    };
    String[] lang3={
            "Kajra Moohbat vala","Aaj koi dua kro","Nain Na","Lak Mera"
    };
    String[] lang4={
            "Kinna Sona", "Ve Maahi","Yaad Piya Ki Aana Lagi","Saanu Ek Pal","Akh Lad Jaave","Coca Cola Tu","Nain Na","Laal Ghaghra"
    };
    String[] lang5={
"Zumba","Illegal Weapon","Lamborgini","Lak Mera","Akhiyon se goli Maare"
    };
    String[] lang6={
            "Ishaare Tere","O Saaki Saaki","Party All Night","Coca Cola Tu"
    };
    public int types;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Intent intent=getIntent();
       types=intent.getIntExtra("types",0);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.my_recycler_view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        int[] image1 = {
                R.raw.akh_lad1,R.raw.coca_cola1,R.raw.lal_ghaghra1,R.raw.party441,R.raw.lamborgini2,R.raw.lak_mera1,R.raw.akhiyon
        };
        int[] image2 = {
                R.raw.coca_cola1,R.raw.lal_ghaghra1,R.raw.party441,R.raw.lamborgini2,R.raw.lak_mera1,R.raw.akhiyon
        };
        int[] image3 = {
                R.raw.kajra_mohbat,R.raw.aaj_koi_pic,R.raw.nain_na,R.raw.lak_mera1,R.raw.akhiyon
        };
        int[] image4 = {
                R.raw.kinna_sona, R.raw.ve_maahi,R.raw.yaad_piya,R.raw.sanu_ek_pal1,R.raw.akh_lad1,R.raw.coca_cola1,R.raw.nain_na,R.raw.lal_ghaghra1
        };
        int[] image5 = {
  R.raw.zumba1,R.raw.party441,R.raw.lamborgini2,R.raw.lak_mera1,R.raw.akhiyon
        };
        int[] image6 = {
               R.raw.ishaaretere, R.raw.o_saaki_saaki,R.raw.party_al,R.raw.coca_cola1
        };
        if(types==R.id.btn1)
            recyclerView.setAdapter(new Adapter(lang1, image1));
        if(types==R.id.btn2)
            recyclerView.setAdapter(new Adapter(lang2, image2));
        if(types==R.id.btn3)
            recyclerView.setAdapter(new Adapter(lang3, image3));
        if(types==R.id.btn4)
            recyclerView.setAdapter(new Adapter(lang4, image4));
        if(types==R.id.btn5)
            recyclerView.setAdapter(new Adapter(lang5, image5));
        if(types==R.id.btn6)
            recyclerView.setAdapter(new Adapter(lang6, image6));
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        recyclerView1.setAdapter(new Adapter(lang1, image1));

    }
}
