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

    private ArrayList<Integer> audios = new ArrayList<>();


    //almacenamos todos los nombres de las imagenes en una sola variable imgURL y imgnam
    private final String imgURL = "VlGGqmG,DWX6eGn,EpmxiT3,V9Pcw5j,HkEJ5K4,DaXpXsG,0IRvKpq,XUZw40U,mjR9oaO";
    private final String imgNam = "Whastapp,Twitter,Youtube,Snapchat,Instagram,Google+,Pinterest,LinkedIN,Facebook";


    private  final Integer music =" cero,latinoamerica,love_of_my_life,muerteenhawai,perdona_si_te_llamo_amor,we_will_rock_you";

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
        audios.addAll(Arrays.asList(music.split(",")));


        audios.add(R.raw.cero);
        audios.add(R.raw.latinoamerica);
        audios.add(R.raw.love_of_my_life);
        audios.add(R.raw.muerteenhawai);
        audios.add(R.raw.perdona_si_te_llamo_amor);
        audios.add(R.raw.we_will_rock_you);


    }

    public void initRecyclerView()
    { //rvContainer contenedor principal de main.xml
        recyclerView = findViewById(R.id.rvContainer);
        //le manda al rvadapter nombre y la imagen
        rvAdapter = new RVAdapter(this, imagesName, imagesURL, audios,this);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //LinearLayoutManager uno ensima de otro
    }


    public void StopPlaying() {
        for(int i = 0; i < rvAdapter.players.size(); i++) {
            //adapter.players.get(i)._clickPause();
            rvAdapter.players.get(i)._clickStop();
        }
    }
}
