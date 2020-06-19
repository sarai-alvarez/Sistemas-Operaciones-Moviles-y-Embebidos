package com.test.appenclase.carpetaplay;

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

public class RVAdapter_play1 extends RecyclerView.Adapter<viewholdeplay>{
    //clase k optimisatodo loklemandamos
    private static final String TAG = "RVAdapter";
    private boolean EO=false;
    private Context context;
    private ArrayList<String> imageNames = new ArrayList<>();
    private  ArrayList<String> imagesURIplay = new ArrayList<>();
    private  ArrayList<String> imagesURIpausa = new ArrayList<>();
    private  ArrayList<String> imagesURIapagar = new ArrayList<>();


    public RVAdapter_play1(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURIplay,ArrayList<String> imagesURIpausa,ArrayList<String> imagesURIapagar)
    {
        this.context = context;
        this.imageNames = imageNames;
        this.imagesURIplay = imagesURIplay;
        this.imagesURIpausa = imagesURIpausa;
        this.imagesURIapagar = imagesURIapagar;
    }

    @Override
    public viewholdeplay onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.play1, viewGroup,false);
        viewholdeplay vHolder = new viewholdeplay(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final viewholdeplay holder, int position) {
      String URI = "https://i.imgur.com/";
    Glide.with(context)
            .asBitmap()
            .load(URI + imagesURIplay.get(position) + ".png")
            .into(holder.getCircleImage1());
    holder.getTvImage1().setText(imageNames.get(position));
    Glide.with(context)
            .asBitmap()
            .load(URI + imagesURIpausa.get(position) + ".png")
            .into(holder.getCircleImage2());
    Glide.with(context)
                .asBitmap()
                .load(URI + imagesURIapagar.get(position) + ".png")
                .into(holder.getCircleImage3());
        holder.getCircleImage2().setVisibility(View.INVISIBLE);
        holder.getCircleImage1().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               holder.getCircleImage1().setVisibility(View.INVISIBLE);
                holder.getCircleImage2().setVisibility(View.VISIBLE);
               Toast.makeText(context,"play music",Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               holder.getCircleImage2().setVisibility(View.INVISIBLE);
                holder.getCircleImage1().setVisibility(View.VISIBLE);
                Toast.makeText(context,"pause music",Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage3().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"stop music",Toast.LENGTH_SHORT).show();
            }
        });    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
