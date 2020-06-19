package com.test.appenclase.Music;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.appenclase.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder2 extends RecyclerView.ViewHolder{

    private RelativeLayout rlcontainer;
    private CircleImageView cv1;

    public RelativeLayout getRlcontainer() {
        return rlcontainer;
    }

    public CircleImageView getCv1() {
        return cv1;
    }

    public CircleImageView getCv2() {
        return cv2;
    }

    public CircleImageView getCv3() {
        return cv3;
    }

    public TextView getTvnombre() {
        return tvnombre;
    }

    private CircleImageView cv2;
    private CircleImageView cv3;
    private TextView tvnombre;

    private void initComponents(View itemView)
    {
        rlcontainer = itemView.findViewById(R.id.rlListItem2);
        cv1 = itemView.findViewById(R.id.cvR);
        cv2 = itemView.findViewById(R.id.cvP);
        cv3 = itemView.findViewById(R.id.cvA);
        tvnombre= itemView.findViewById(R.id.tv1);
    }

    public ViewHolder2(@NonNull View itemView) {
        super(itemView);
        initComponents(itemView);
    }
}
