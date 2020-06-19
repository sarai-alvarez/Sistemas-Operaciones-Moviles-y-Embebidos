package com.test.appenclase.carpetaplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.test.appenclase.Adapter.RVAdapter;
import com.test.appenclase.R;

import java.util.ArrayList;
import java.util.Arrays;

public class PLAY1_P extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2,recyclerView3;
    private RVAdapter_play1 rvAdapterPlay1;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURLPLAY = new ArrayList<>();
    private ArrayList<String> imagesURLPAUSA = new ArrayList<>();
    private ArrayList<String> imagesURLAPAGAR = new ArrayList<>();


    //almacenamos todos los nombres de las imagenes en una sola variable imgURL y imgnam
    private final String imagesurlPLAY = "59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final String imagesurlPAUSA ="2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
   private final String imagesurlAPAGAR ="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";
    private final String imagesNameee = "Music 1,Music 2,Music 3,Music 4,Music 5,Music 6,Music 7,Music 8, Music 9,Music 10,Music 11,Music 12";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_l_a_y1__p);
        initImageBitMaps();
        initRecyclerView();
    }
    public void initImageBitMaps()
    {//agregamos dentro del array las imagenes y sus nombres
     // le setiamos un valor numerico
//funcion addAll hace lo mismo sin crear una variable extra
        imagesURLPLAY.addAll(Arrays.asList(imagesurlPLAY.split(",")));
        imagesURLPAUSA.addAll(Arrays.asList(imagesurlPAUSA.split(",")));
        imagesURLAPAGAR.addAll(Arrays.asList(imagesurlAPAGAR.split(",")));
        imagesName.addAll(Arrays.asList(imagesNameee.split(",")));
    }

    public void initRecyclerView()
    { //rvContainer contenedor principal de main.xml
        recyclerView1 = findViewById(R.id.rvContainerREPRODUCIR);
       // recyclerView2 = findViewById(R.id.rvContainerPAUSA);
       // recyclerView3= findViewById(R.id.rvContainerAPAGAR);
        //le manda al rvadapter nombre y la imagen
        rvAdapterPlay1 = new RVAdapter_play1(this, imagesName, imagesURLPLAY,imagesURLPAUSA,imagesURLAPAGAR);
        recyclerView1.setAdapter(rvAdapterPlay1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        //LinearLayoutManager uno ensima de otro
    }

}