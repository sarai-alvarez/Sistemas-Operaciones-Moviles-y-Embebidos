package com.test.hito2_sarai_alvarez;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class nuevo extends AppCompatActivity {

    private EditText etnumero1C,etnumero2C,etnumero1S,etnumero2S,etnumero1O,etnumero2O,
            editingre1,editingre2,editingre3;
    private TextView tvccC,tvcsC,tvccS,tvcsS,tvccO,tvcsO, mensaje;
    private Button setvalue,btcalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    private void initializeVariables() {
        etnumero1C = findViewById(R.id.etnumero1C);
        etnumero2C = findViewById(R.id.etnumero2C);

        etnumero1S = findViewById(R.id.etnumero1S);
        etnumero2S = findViewById(R.id.etnumero2S);

        etnumero1O = findViewById(R.id.etnumero1O);
        etnumero2O = findViewById(R.id.etnumero2O);

        editingre1 = findViewById(R.id.editingre1);
        editingre2 = findViewById(R.id.editingre2);
        editingre3 = findViewById(R.id.editingre3);

        setvalue = findViewById(R.id.btsetvalue);
        btcalcular = findViewById(R.id.btcalcular);

        tvccC = findViewById(R.id.tvccC);
        tvcsC = findViewById(R.id.tvcsC);
        tvccS = findViewById(R.id.tvccS);
        tvcsS = findViewById(R.id.tvcsS);
        tvccO = findViewById(R.id.tvccO);
        tvcsO = findViewById(R.id.tvcsO);



    }

    private void calculo(){

        int valor1 = Integer.parseInt(etnumero1C.getText().toString());
        int valor2 = Integer.parseInt(etnumero2C.getText().toString());

        int valor3 = Integer.parseInt(etnumero1S.getText().toString());
        int valor4 = Integer.parseInt(etnumero2S.getText().toString());

        int valor5 = Integer.parseInt(etnumero1O.getText().toString());
        int valor6 = Integer.parseInt(etnumero2O.getText().toString());

        int r = valor1+valor2+valor3+valor4+valor5+valor6;

        mensaje.setText(""+r);
        //Toast.makeText(getApplication(),"click button clear", Toast.LENGTH_LONG).show();

    }
}
