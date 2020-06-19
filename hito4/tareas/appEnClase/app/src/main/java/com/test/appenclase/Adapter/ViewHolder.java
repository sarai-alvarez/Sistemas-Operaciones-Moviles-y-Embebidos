package com.test.appenclase.Adapter;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.test.appenclase.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder
{//clase k accede a nuestro componente    a la imagen y al texto


    private RelativeLayout rlContainer;
    private CircleImageView circleImage;
    private TextView tvImage;


    ///declara los botones
    Button btnPlay, btnPause, btnStop;

    private void initComponents(View itemView)
    {
        rlContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);



        btnPlay = itemView.findViewById(R.id.btplay);
        btnPause = itemView.findViewById(R.id.btpause);
        btnStop = itemView.findViewById(R.id.btstop);
    }



    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        initComponents(itemView);
    }
    public void setRlContainer(RelativeLayout rlContainer){
        this.rlContainer = rlContainer;
    }
    public RelativeLayout getRlContainer() {
        return rlContainer;
    }
    public CircleImageView getCircleImage() {
        return circleImage;
    }

    public TextView getTvImage() {
        return tvImage;
    }
}
