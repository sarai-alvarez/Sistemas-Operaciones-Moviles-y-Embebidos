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
    private  Button boton;
    private void initComponents(View itemView)
    {
        rlContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);
        boton=itemView.findViewById(R.id.btplay);
    }

    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        initComponents(itemView);
    }

    public Button getBoton() {
        return boton;
    }

    public CircleImageView getCircleImage() {
        return circleImage;
    }
    public RelativeLayout getRlContainer() {
        return rlContainer;
    }
    public TextView getTvImage() {
        return tvImage;
    }
}
