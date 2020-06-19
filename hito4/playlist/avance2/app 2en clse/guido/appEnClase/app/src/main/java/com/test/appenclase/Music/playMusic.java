package com.test.appenclase.Music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.test.appenclase.R;

import java.util.ArrayList;
import java.util.Arrays;

public class playMusic extends AppCompatActivity {


    private RecyclerView recyclerView1;
    private RVAdapter2 rvAdapter2;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> urlrep = new ArrayList<>();
    private ArrayList<String> urlpausa = new ArrayList<>();
    private ArrayList<String> urlstop = new ArrayList<>();

     private final String im_urlrep = "59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final String im_urlpausa ="2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
    private final String im_urlstop ="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";
    private final String imagesNameee = "Playist 1,Playist 2,Playist 3,Playist 4,Playist 5,Playist 6,Playist 7,Playist 8, Playist 9,Playist 10,Playist 11,Playist 12";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
        initImageBitMaps();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView1 = findViewById(R.id.rvContainerR);

        rvAdapter2 = new RVAdapter2(this, imagesName, urlrep,urlpausa,urlstop);
        recyclerView1.setAdapter(rvAdapter2);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initImageBitMaps() {
        urlrep.addAll(Arrays.asList(im_urlrep.split(",")));
        urlpausa.addAll(Arrays.asList(im_urlpausa.split(",")));
        urlstop.addAll(Arrays.asList(im_urlstop.split(",")));
        imagesName.addAll(Arrays.asList(imagesNameee.split(",")));
    }


}