package com.test.appenclase.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.test.appenclase.MainActivity;
import com.test.appenclase.R;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder>
{   //clase k optimisatodo loklemandamos
    private static final String TAG = "RVAdapter";

    private Context context;
    private  ArrayList<String> imageNames = new ArrayList<>();
    private  ArrayList<String> imagesURI = new ArrayList<>();


    MainActivity mainActivity;
    private ArrayList<Integer> audios = new ArrayList<>();
    public ArrayList<MusicPlayer> players = new ArrayList<>();

    public RVAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURI,ArrayList<Integer> audios, MainActivity mainActivity)
    {
        this.context = context;
        this.imageNames = imageNames;
        this.imagesURI = imagesURI;


        this.audios = audios;
        this.mainActivity = mainActivity;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item, viewGroup,false);
        ViewHolder vHolder = new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {//glide libreria importante
        String URI = "https://i.imgur.com/";//todas las variables tienen el mismo dominnio, es una imagen estatico
        //entonces de la sig forma tendremos de manera dinamica y cargara tosas las imagenes de la web
        Glide.with(context)//la libreria adapta el tamano de la imagen
                .asBitmap()
                .load(URI + imagesURI.get(position) + ".png")//aqui le paso carga desde una url internet
                .into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));



        MusicPlayer player = new MusicPlayer(context, audios.get(position), mainActivity, holder,position);
        holder.btnPlay.setOnClickListener(player);
        holder.btnPause.setOnClickListener(player);
        holder.btnStop.setOnClickListener(player);
        players.add(player);


        //cuando aga clik mostrara el mensaje
        holder.getRlContainer().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() { //determina cuantos elementos tendra el listado
        return imageNames.size();
    }
}
