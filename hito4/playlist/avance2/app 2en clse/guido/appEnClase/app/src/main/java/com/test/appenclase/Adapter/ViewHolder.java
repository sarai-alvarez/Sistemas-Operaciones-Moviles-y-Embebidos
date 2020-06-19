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
    public RelativeLayout getRlContainer() {
        return rlContainer;
    }
    private Button escuchar;


    private RelativeLayout rlContainer;
    private CircleImageView circleImage;
    private TextView tvImage;



    private void initComponents(View itemView)
    {
        rlContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);

        escuchar=itemView.findViewById(R.id.btplay);
    }

    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        initComponents(itemView);
    }
    public Button getEscuchar() {
        return escuchar;
    }
    public CircleImageView getCircleImage() {
        return circleImage;
    }

    public TextView getTvImage() {
        return tvImage;
    }
}
