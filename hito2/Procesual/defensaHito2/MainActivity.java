package com.test.defensadelhito2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
private EditText conf, sosp, etciudad, buscar, confCb, confSc, confOr, sospCb, sospSc, sospOr;
private Button setvalues, calcular;
private String sconf,ssosp,ciudad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    public void initializeVariables() {
        confCb = findViewById(R.id.confCb);
        confSc = findViewById(R.id.confSc);
        confOr = findViewById(R.id.confOr);

        sospCb = findViewById(R.id.sospCb);
        sospSc = findViewById(R.id.sospSc);
        sospOr = findViewById(R.id.sospOr);

        conf = findViewById(R.id.confirmados);
        sosp = findViewById(R.id.sospechosos);
        etciudad = findViewById(R.id.etciudad);
        buscar = findViewById(R.id.etbuscar);


        setvalues = findViewById(R.id.setvalues);
        setvalues.setOnClickListener(this);

        calcular = findViewById(R.id.btcalcular);
        calcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.setvalues:
                llevar();
                break;
            case R.id.btcalcular:
                calcular();
                break;
        }
    }
    public void llevar()
    {
        sconf=conf.getText().toString();
        ssosp=sosp.getText().toString();
        ciudad=etciudad.getText().toString();
        if(ciudad.equals("cbba"))
        {
            confCb.setText(sconf);
            sospCb.setText(ssosp);
        }
        if(ciudad.equals("sc"))
        {
            confSc.setText(sconf);
            sospSc.setText(ssosp);
        }
        if(ciudad.equals("or"))
        {
            confOr.setText(sconf);
            sospOr.setText(ssosp);
        }
    }
    public void calcular()
{
    int v1 = Integer.parseInt(confCb.getText().toString());
    int v2 = Integer.parseInt(confSc.getText().toString());
    int v3 = Integer.parseInt(confOr.getText().toString());
    int v4 = Integer.parseInt(sospCb.getText().toString());
    int v5 = Integer.parseInt(sospSc.getText().toString());
    int v6 = Integer.parseInt(sospOr.getText().toString());

    if(buscar.getText().toString().equals("sospe"))
    {
        if(v4<v5)
        {
            if(v5<v6)
            {Toast.makeText(getApplication(),"los confirmados son "+v4,Toast.LENGTH_SHORT ).show();}
            else
            {Toast.makeText(getApplication(),"los confirmados son "+v5,Toast.LENGTH_SHORT ).show();}
        }
        else if(v4>v5)
        {
            if(v4<v6)
            {Toast.makeText(getApplication(),"los confirmados son "+v6,Toast.LENGTH_SHORT ).show();}
            else
            {Toast.makeText(getApplication(),"los confirmados son "+v4,Toast.LENGTH_SHORT ).show();}
        }
    }
    if(buscar.getText().toString().equals("confir"))
    {
        if(v1<v2)
        {
            if(v2<v3)
            {Toast.makeText(getApplication(),"los confirmados son "+v3,Toast.LENGTH_SHORT ).show();}
            else
            {Toast.makeText(getApplication(),"los confirmados son "+v2,Toast.LENGTH_SHORT ).show();}
        }
        else if(v1>v2)
        {
            if(v1<v3)
            { Toast.makeText(getApplication(),"los confirmados son "+v3,Toast.LENGTH_SHORT ).show(); }
            else
            {Toast.makeText(getApplication(),"los confirmados son "+v1,Toast.LENGTH_SHORT ).show();}
        }
    }
}
    }

