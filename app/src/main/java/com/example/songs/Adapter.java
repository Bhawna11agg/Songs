package com.example.songs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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

    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.page2_card, parent, false);
        return new ViewAdapter(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull final ViewAdapter holder, final int position) {
        final int image_id = imagesId[position];
        final String title = data[position];
        holder.txt.setText(title);
        holder.img.setImageResource(image_id);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),song1.class);
               intent.putExtra("visible",data[position]);
               intent.putExtra("visible2",imagesId[position]);
               intent.putExtra("position",position);

                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewAdapter extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        public ViewAdapter(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.i1);
            txt = (TextView) itemView.findViewById(R.id.txt1);
        }

    }
}
