package com.test.appenclase.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.test.appenclase.R;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder> {
private static final String TAG="RVAdapter";
private Context context;
private ArrayList <String>imageNames=new ArrayList<>();
private ArrayList <Integer>images=new ArrayList<>();
    public RVAdapter(Context context, ArrayList<String> imageNames , ArrayList<Integer> images) {
        this.context =context;
        this.imageNames=imageNames;
        this.images=images;
    }
    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item, viewGroup,false);
        ViewHolder vHolder= new ViewHolder(view);
        return  vHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(images.get(position)).into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));
        holder.getRlContainer().setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
