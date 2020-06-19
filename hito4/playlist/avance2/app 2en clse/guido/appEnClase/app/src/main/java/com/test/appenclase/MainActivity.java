package com.test.appenclase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.test.appenclase.Adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL = new ArrayList<>();
    private final String imgURL = "sypYnSP,9jMbaX2,rYndmdq,yB3d2qH,XzffKgy,XzffKgy,HBeK1ot,YCqbt8r,eLk31XX,4ZHp7FO,DJabk5C,V4OgA4O,eLk31XX";
    private final String imgNam = "Playist 1,Playist 2,Playist 3,Playist 4,Playist 5,Playist 6,Playist 7,Playist 8, Playist 9,Playist 10,Playist 11,Playist 12";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps()
    {
        imagesURL.addAll(Arrays.asList(imgURL.split(",")));
        imagesName.addAll(Arrays.asList(imgNam.split(",")));

    }

    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
