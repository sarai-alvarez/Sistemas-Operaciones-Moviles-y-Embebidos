package com.test.appenclase.Adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.test.appenclase.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {
private RelativeLayout rlContainer;
public CircleImageView circleImage;
private TextView tvImage;
    public ViewHolder( View itemView) {
        super(itemView);
        iniComponents(itemView);

    }
    private void iniComponents(View itemView)
    {
        rlContainer=itemView.findViewById(R.id.rlListItem);
        circleImage=itemView.findViewById(R.id.civItem);
        tvImage=itemView.findViewById(R.id.tvImage);

    }//fin de inicomponents

    public TextView getTvImage() {
        return tvImage;
    }

    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public CircleImageView getCircleImage() {
        return circleImage;
    }
}
