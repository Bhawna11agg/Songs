package com.example.songs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewAdapter> {
    String[] data1;
    int[] imagesId1;

    public Adapter2(String[] data, int[] imagesId) {
        this.data1 = data;
        this.imagesId1 = imagesId;
    }
    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView=inflater.inflate(R.layout.singer1,parent,false);
        return new ViewAdapter(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter holder, int position) {
        int image_id=imagesId1[position];
        String title=data1[position];
        holder.txt1.setText(title);
        holder.img1.setImageResource(image_id);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ViewAdapter extends RecyclerView.ViewHolder{
        ImageView img1;
        TextView txt1;
        public ViewAdapter(@NonNull View itemView) {
            super(itemView);
            img1=(ImageView)itemView.findViewById(R.id.i2);
            txt1=(TextView)itemView.findViewById(R.id.txt2);
        }
    }
}
