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
    //almacenamos todos los nombres de las imagenes en una sola variable imgURL y imgnam
    private final String imgURL = "V4OgA4O,yB3d2qH,9jMbaX2,rYndmdq,sypYnSP,HBeK1ot,YCqbt8r,eLk31XX,XzffKgy,4ZHp7FO,DJabk5C,XzffKgy,XzffKgy";
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
    {//agregamos dentro del array las imagenes y sus nombres
        //le setiamos un valor numerico

//String[] getNames = imgURL.split(",");//split funcion agarra la cadena principal donde
// encuentra una coma o lo k sea lo separa esto de ->private final String imgUrl
// for(String img:getNames)
        // {    imagesURL.add(img);     }

//funcion addAll hace lo mismo sin crear una variable extra
        imagesURL.addAll(Arrays.asList(imgURL.split(",")));
        imagesName.addAll(Arrays.asList(imgNam.split(",")));

    }

    public void initRecyclerView()
    { //rvContainer contenedor principal de main.xml
        recyclerView = findViewById(R.id.rvContainer);
        //le manda al rvadapter nombre y la imagen
        rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //LinearLayoutManager uno ensima de otro
    }
}
