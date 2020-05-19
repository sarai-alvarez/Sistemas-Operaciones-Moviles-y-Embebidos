package com.test.umboarding.App;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.test.umboarding.R;
public class App extends AppCompatActivity {
    private boolean EO=false;
    private EditText pantalla;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private Button suma,resta,mul,divi,igu;
    private Button punto,  porsen, cm, facc, C,senn,tng,raiz,cos,shift, borrar;
    private double aux1=0,aux2=0;
    private String aux3="";
    private char letra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_calculadora);

        _initialize();
        _addClickDoneAndPrev();
    }
    public void _initialize() {

        senn=(Button)findViewById(R.id.senn);
        tng=(Button)findViewById(R.id.tng);
        raiz=(Button)findViewById(R.id.raiz);
        cos  =(Button)findViewById(R.id.cos);

        borrar= (Button) findViewById(R.id.btborrar);
        punto = (Button) findViewById(R.id.punto);
        porsen= (Button) findViewById(R.id.porcentaje);
        cm= (Button) findViewById(R.id.cm);
        facc= (Button) findViewById(R.id.facc);



        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        suma=(Button)findViewById(R.id.editsum);
        resta=(Button)findViewById(R.id.editres);
        mul=(Button)findViewById(R.id.editmul);
        divi=(Button)findViewById(R.id.editdiv);
        igu=(Button)findViewById(R.id.editigual);

        pantalla=(EditText)findViewById(R.id.caja);
        C=(Button)findViewById(R.id.editlimpiar);

        senn=(Button)findViewById(R.id.senn);
        tng=(Button)findViewById(R.id.tng);
        raiz=(Button)findViewById(R.id.raiz);
        cos  =(Button)findViewById(R.id.cos);

        shift=(Button)findViewById(R.id.btnshift);

    }
    public void _addClickDoneAndPrev() {
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aux3=pantalla.getText().toString();
                aux3+=0;
                pantalla.setText(aux3);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=1;
                pantalla.setText(aux3);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=2;
                pantalla.setText(aux3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=3;
                pantalla.setText(aux3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=4;
                pantalla.setText(aux3);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=5;
                pantalla.setText(aux3);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=6;
                pantalla.setText(aux3);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=7;
                pantalla.setText(aux3);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=8;
                pantalla.setText(aux3);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pantalla.getText().toString();
                aux3+=9;
                pantalla.setText(aux3);
            }
        });

        punto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aux3 = pantalla.getText().toString();
                aux3 =aux3 + ".";
                pantalla.setText(aux3);
            }
        });

        porsen.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                aux1=Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("");
                letra='s';
            }
        });

        cm.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                aux3 = pantalla.getText().toString();
                aux3 =aux3 + "1";
                aux2 = Double.parseDouble(pantalla.getText().toString())* (-1);
                pantalla.setText(String.valueOf(aux2));
            }
        });








        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                }
                else
                {
                    aux1+=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='+';
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());

                }
                else
                {
                    aux1-=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='-';
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                }
                else
                {aux1*=Double.parseDouble(pantalla.getText().toString()); }
                pantalla.setText("");
                letra='*';
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux1==0)
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                }
                else
                {
                    aux1/=Double.parseDouble(pantalla.getText().toString());
                }
                pantalla.setText("");
                letra='/';
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux1=0;
                aux2=0;
                aux3="";
                letra=' ';
                pantalla.setText("");
            }
        });
        borrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(aux3.length()>0)
                {
                    aux3 =pantalla.getText().toString();

                    aux3 = aux3.substring(0,aux3.length()-1);
                    pantalla.setText(aux3);}
            }
        });

        facc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x,x2=1;
                x=Double.parseDouble(pantalla.getText().toString());
                for(int i=1;i<=x;i++)
                {  x2*=i; }
                pantalla.setText(""+x2);
            }
        });

        igu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux2=Double.parseDouble(pantalla.getText().toString());
                pantalla.setText("");
                switch (letra)
                {
                    case '+': {
                        pantalla.setText(""+ (aux1+aux2));
                        break;
                    }
                    case '-': {
                        pantalla.setText(""+ (aux1-aux2));
                        break;
                    }
                    case '*': {
                        pantalla.setText(""+ (aux1*aux2));
                        break;
                    }
                    case '/':
                    {
                        pantalla.setText(""+ (aux1/aux2));
                        break;
                    }
                    case 's':
                    {
                        pantalla.setText(""+(aux2*aux1)/100);
                        break;
                    }
                    case 'x':
                    {
                        pantalla.setText(""+(Math.pow(aux1,aux2)));
                        break;
                    }



                }
            }
        });

        shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EO==false)
                {
                    raiz.setText("X^_");
                    cos.setText("COS-1");
                    senn.setText("SEN-1");
                    tng.setText("X^2");
                    EO=true;
                }
                else
                {   raiz.setText("√");
                    cos.setText("COS");
                    senn.setText("SEN");
                    tng.setText("TNG");
                    EO=false;
                }
            }
        });
        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x2;
                x2=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.sqrt(x2)));
                }
                else
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    letra='x';
                }

            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x,x2;
                x=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.cos(x)));
                }
                else
                {
                    x2=Math.cos(x);
                    pantalla.setText(""+(Math.pow(x2,-1)));
                }
            }
        });
        tng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1;
                x1=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                { pantalla.setText(""+(Math.tan(x1)));  }
                else
                { pantalla.setText(""+(Math.pow(x1,2)));  }
            }
        });
        senn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x,x2;
                x=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.sin(x)));
                }
                else
                {
                    x2=Math.sin(x);
                    pantalla.setText(""+(Math.pow(x2,-1)));
                }
            }
        });

    }
}

