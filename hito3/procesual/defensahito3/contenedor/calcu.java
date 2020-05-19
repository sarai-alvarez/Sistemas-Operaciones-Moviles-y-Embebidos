package com.test.examenhito3.contenedor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.test.examenhito3.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.test.examenhito3.R;

public class calcu extends AppCompatActivity {
    private TextView tvShowUsername,tvShowSelect;
    private boolean EO=false;
    private EditText pant;
    private Button  btnsuma,btnresta,btnmul,btndivi,btnigu,btn1,btn2,btn3,btn4
            ,btn0,C,facto,shift,x2, x3, znu;
    private double aux1=0,aux2=0, res;
    private String aux3="";
    private char letra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);
        iniciarvar();
        iniciarsaludo();
        addClickDoneAndPrev();
    }
    public void iniciarsaludo() {
        tvShowSelect = findViewById(R.id.tvShowSelect);
        String APP = getIntent().getStringExtra("APP: ");
        String msg1 = "APP: "+ APP;
        tvShowSelect.setText(msg1);
        tvShowUsername = findViewById(R.id.tvShowUsername);
        String username = getIntent().getStringExtra("Bienvenido: ");
        String msg = "BIENVENIDO: " + username;
        tvShowUsername.setText(msg);
    }
    public void iniciarvar() {
        facto=(Button)findViewById(R.id.facto);
        znu=(Button)findViewById(R.id.znu);
        x2=(Button)findViewById(R.id.x2);
        x3=(Button)findViewById(R.id.x3);
        btn0=(Button)findViewById(R.id.b0);
        btn1=(Button)findViewById(R.id.b1);
        btn2=(Button)findViewById(R.id.b2);
        btn3=(Button)findViewById(R.id.b3);
        btn4=(Button)findViewById(R.id.b4);
        btnsuma=(Button)findViewById(R.id.editsum);
        btnresta=(Button)findViewById(R.id.editres);
        btnmul=(Button)findViewById(R.id.editmul);
        btndivi=(Button)findViewById(R.id.editdiv);
        btnigu=(Button)findViewById(R.id.editigual);
        pant=(EditText)findViewById(R.id.etco1);
        C=(Button)findViewById(R.id.editlimpiar);
        shift=(Button)findViewById(R.id.btnshift);
    }
    public void addClickDoneAndPrev() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pant.getText().toString();
                aux3+=0;
                pant.setText(aux3);     }    });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pant.getText().toString();
                aux3+=1;
                pant.setText(aux3);         }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pant.getText().toString();
                aux3+=2;
                pant.setText(aux3);          }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pant.getText().toString();
                aux3+=3;
                pant.setText(aux3);           }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux3=pant.getText().toString();
                aux3+=4;
                pant.setText(aux3);            }
        });


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux1==0){ aux1=Double.parseDouble(pant.getText().toString()); }
                else { aux1+=Double.parseDouble(pant.getText().toString()); }
                pant.setText("");
                letra='+';          }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux1==0)
                { aux1=Double.parseDouble(pant.getText().toString()); }
                else
                {aux1-=Double.parseDouble(pant.getText().toString()); }
                pant.setText("");
                letra='-'; }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux1==0)  { aux1=Double.parseDouble(pant.getText().toString());  }
                else { aux1*=Double.parseDouble(pant.getText().toString()); }
                pant.setText("");
                letra='*';  }      });
        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aux1==0) {aux1=Double.parseDouble(pant.getText().toString());   }
                else { aux1/=Double.parseDouble(pant.getText().toString());  }
                pant.setText("");
                letra='/';     } });



        btnigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux2=Double.parseDouble(pant.getText().toString());
                pant.setText("");
                switch (letra)
                {
                    case '+': { pant.setText(""+ (aux1+aux2)); break;}
                    case '-': { pant.setText(""+ (aux1-aux2)); break; }
                    case '*': { pant.setText(""+ (aux1*aux2)); break; }
                    case '/': { pant.setText(""+ (aux1/aux2)); break; }
                    case 's': { pant.setText(""+(aux2*aux1)/100); break; }
                    case 'x': { pant.setText(""+(Math.pow(aux1,aux2))); break; }
                    case 'z': { for(Double i = aux1;i<=aux2;i++)
                    { res = res+i;  }
                        pant.setText(""+res);   break;   }
                }   }  });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux1=0;
                aux2=0;
                aux3="";
                letra=' ';
                pant.setText("");}   });
        shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EO==false)
                {   x2.setText("x3");
                    x3.setText("xy");
                    facto.setText("zfibo");
                    znu.setText("znxy");
                    EO=true;                }
                else {   x2.setText("x2");
                    x3.setText("x3");
                    facto.setText("fac");
                    znu.setText("znu");
                    EO=false;    }   }        });
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x2;
                x2=Double.parseDouble(pant.getText().toString());
                if(EO==false) {pant.setText(""+(Math.pow(x2,2)));  }
                else {pant.setText(""+(Math.pow(x2,3))); }  }  });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x;
                x=Double.parseDouble(pant.getText().toString());
                if(EO==false){ pant.setText(""+(Math.pow(x,3))); }
                else{aux1=Double.parseDouble(pant.getText().toString());
                    pant.setText("");
                    letra='x'; } }    });
        znu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x1;                double x2=1, y;
                x1=Double.parseDouble(pant.getText().toString());
                if(EO==false) {
                    for(int i=1;i<=x1;i++)
                    {  x2+=i; }
                    pant.setText(""+x2); }
                else{    aux1=Double.parseDouble(pant.getText().toString());
                    pant.setText("");
                    letra='z'; } }   });
        facto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x,x2=1;
                int f =0, t1 =1,t2,sum =0;
                x=Double.parseDouble(pant.getText().toString());
                if(EO==false) {
                    for(int i=1;i<=x;i++)
                    {  x2*=i; }
                    pant.setText(""+x2); }
                else {for(double i = 1;i<=x;i++)
                {   t2 = f;
                    f = t1 +f;
                    t1 = t2;
                    sum = sum + t1; }
                    pant.setText(""+sum); } } });

    }
}
