package com.test.appenclase.carpetaplay;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.appenclase.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class viewholdeplay extends RecyclerView.ViewHolder{

    private RelativeLayout rlContainer;
    private CircleImageView circleImage1;
    private CircleImageView circleImage2;
    private CircleImageView circleImage3;
    private TextView tvImage1;

    private void initComponents(View itemView)
    {
        rlContainer = itemView.findViewById(R.id.rlListItemplay);
        circleImage1 = itemView.findViewById(R.id.reproducir);
        circleImage2 = itemView.findViewById(R.id.pausa);
        circleImage3 = itemView.findViewById(R.id.apagar);
        tvImage1= itemView.findViewById(R.id.tvImage1);
    }

    public viewholdeplay(@NonNull View itemView) {
        super(itemView);
        initComponents(itemView);
    }
    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public CircleImageView getCircleImage1() {
        return circleImage1;
    }

    public CircleImageView getCircleImage2() {
        return circleImage2;
    }

    public CircleImageView getCircleImage3() {
        return circleImage3;
    }

    public TextView getTvImage1() {
        return tvImage1;
    }
}
