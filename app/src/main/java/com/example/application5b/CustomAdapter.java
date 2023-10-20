package com.example.application5b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myviewholder> {

    Context context;
    String[] countryList;
    int[] images;


    public CustomAdapter(Context applicationContext, String[] countryList, int[] images) {
    this.context=applicationContext;
    this.countryList=countryList;
    this.images= images;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item,parent,false);

        return new myviewholder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {


        holder.img.setImageResource(images[position]);
        holder.txt.setText(countryList[position]);







    }

    @Override
    public int getItemCount() {
        return countryList.length;
    }

    public class myviewholder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txt;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.rv_img);
            txt = itemView.findViewById(R.id.rv_text);

        }
    }



}
