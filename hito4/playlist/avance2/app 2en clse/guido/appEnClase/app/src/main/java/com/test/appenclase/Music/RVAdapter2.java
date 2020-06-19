package com.test.appenclase.Music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.test.appenclase.R;

import java.util.ArrayList;

public class RVAdapter2 extends RecyclerView.Adapter<ViewHolder2> {
    private static final String TAG = "RVAdapter";
    private Context context;
    private ArrayList<String> imageNames = new ArrayList<>();
    private  ArrayList<String> im_rep = new ArrayList<>();
    private  ArrayList<String> im_pausa = new ArrayList<>();
    private  ArrayList<String> im_stopp = new ArrayList<>();

    public RVAdapter2(Context context, ArrayList<String> imageNames, ArrayList<String> im_rep,ArrayList<String> im_pausa,ArrayList<String> im_stop)
    {
        this.context = context;
        this.imageNames = imageNames;
        this.im_rep = im_rep;
        this.im_pausa = im_pausa;
        this.im_stopp = im_stop;////////correccion
    }

    @Override
    public ViewHolder2 onCreateViewHolder( ViewGroup  viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item_2, viewGroup,false);
        ViewHolder2 vHolder = new ViewHolder2(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder2 holder, int position) {
        String URI = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI + im_rep.get(position) + ".png")
                .into(holder.getCv1());
        holder.getTvnombre().setText(imageNames.get(position));

        String URI2 = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI2 + im_pausa.get(position) + ".png")
                .into(holder.getCv2());

        String URI3 = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI3 + im_stopp.get(position) + ".png")
                .into(holder.getCv3());



        holder.getCv1().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               holder.getCv1().setVisibility(View.INVISIBLE);
              holder.getCv2().setVisibility(View.VISIBLE);
                Toast.makeText(context,"PLAY MUSIC",Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCv2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.getCv2().setVisibility(View.INVISIBLE);
               holder.getCv1().setVisibility(View.VISIBLE);
                Toast.makeText(context,"PAUSE MUSIC",Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCv3().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"STOP MUSIC",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
