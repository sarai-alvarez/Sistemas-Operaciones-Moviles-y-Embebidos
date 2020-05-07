package com.example.examenhito3.contenedor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.examenhito3.R;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;



public class calcu extends AppCompatActivity {
    private boolean EO=false;
    private EditText pantalla;
    private Button b1,b2,b3,b4,b0;
    private Button suma,resta,mul,divi,igu;
    private Button  C,senn,tng,raiz,cos,shift,x2,xy,fact;
    private double aux1=0,aux2=0;
    private String aux3="";
    private char letra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);
        _initialize();
        _addClickDoneAndPrev();
    }

    public void _initialize() {

       xy=(Button)findViewById(R.id.xy);
        fact=(Button)findViewById(R.id.fact);
        raiz=(Button)findViewById(R.id.raiz);
        x2  =(Button)findViewById(R.id.x2);
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        suma=(Button)findViewById(R.id.editsum);
        resta=(Button)findViewById(R.id.editres);
        mul=(Button)findViewById(R.id.editmul);
        divi=(Button)findViewById(R.id.editdiv);
        igu=(Button)findViewById(R.id.editigual);
        pantalla=(EditText)findViewById(R.id.caja);
        C=(Button)findViewById(R.id.editlimpiar);
        senn=(Button)findViewById(R.id.xy);
        fact=(Button)findViewById(R.id.fact);
        raiz=(Button)findViewById(R.id.raiz);
        cos  =(Button)findViewById(R.id.x2);
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
                {
                    aux1*=Double.parseDouble(pantalla.getText().toString());
                }
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


                    case 'e':{
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
                    xy.setText("x^y");
                    x2.setText("x3");
                    fact.setText("fibo");
                    EO=true;
                }
                else
                {   raiz.setText("√");
                    xy.setText("x3");
                    x2.setText("x2");
                    fact.setText("fac");
                    EO=false;
                }
            }
        });


        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x,x2=1;
                x=Double.parseDouble(pantalla.getText().toString());
                for(int i=1;i<=x;i++)
                {  x2*=i; }
                pantalla.setText(""+x2);
            }
        });

        xy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1;
                x1=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.pow(x1,3)));
                }
                else
                {
                    aux1=Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    letra='e';
                }
            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1;
                x1=Double.parseDouble(pantalla.getText().toString());
                if(EO==false)
                {
                    pantalla.setText(""+(Math.pow(x1,2)));
                }
                else
                {
                    pantalla.setText(""+(Math.pow(x1,3)));
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
                   letra='e';
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
