package com.example.songs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewAdapter> {
    String[] data;
    int[] imagesId;
    public Adapter(String[] data, int[] imagesId) {
        this.data = data;
        this.imagesId = imagesId;
    }
    public interface ItemClickListener{
        void onClick(View view,int position);
    }
    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView=inflater.inflate(R.layout.songs,parent,false);
        return new ViewAdapter(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter holder, int position) {
    int image_id=imagesId[position];
    String title=data[position];
   holder.txt.setText(title);
   holder.img.setImageResource(image_id);
    }
    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewAdapter extends RecyclerView.ViewHolder{
ImageView img;
TextView txt;
        public ViewAdapter(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.i1);
            txt=(TextView)itemView.findViewById(R.id.txt1);
        }
    }
}
