package com.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
private EditText et1,et2;
private TextView tv1,tvrespuesta;
private Button btSumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    inicializeVariables();
    }
public void inicializeVariables()
{
    btSumar=findViewById(R.id.btSumar);

    et1=findViewById(R.id.etnumber1);
    et2=findViewById(R.id.etnumber2);

    tv1=findViewById(R.id.tv1);
    tv1.setText("suma");

    tvrespuesta=findViewById(R.id.tv2);


    btSumar.setOnClickListener(this);


}


    @Override
    public void onClick(View v) {

       switch(v.getId())
       {
           case R.id.btSumar:
               String n1=et1.getText().toString();
               String n2=et2.getText().toString();
               int respuesta=Integer.parseInt(n1)+Integer.parseInt(n2);
               tvrespuesta.setText(""+respuesta);
               break;

       }
    }


}
