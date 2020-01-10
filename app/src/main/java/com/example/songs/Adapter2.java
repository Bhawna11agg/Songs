package com.example.songs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewAdapter> {
public static int playlist,flag=1;
    String[] data1;
    public Adapter2(String[] data) {
        this.data1 = data;
    }

    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView=inflater.inflate(R.layout.singer1,parent,false);
        return new ViewAdapter(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewAdapter holder, final int position) {


        String title = data1[position];
        holder.txt1.setText(title);
        holder.txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt=new Intent(v.getContext(),onlytext1.class);
                intentt.putExtra("position",position);

                v.getContext().startActivity(intentt);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ViewAdapter extends RecyclerView.ViewHolder{
        TextView txt1;
        public ViewAdapter(@NonNull View itemView) {
            super(itemView);
            txt1=(TextView)itemView.findViewById(R.id.txt2);
        }
    }
}
