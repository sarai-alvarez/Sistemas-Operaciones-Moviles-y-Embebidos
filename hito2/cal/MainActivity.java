package com.test.suma2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button butt1;
    private EditText n1, n2;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciazeVariables();
    }

    public void iniciazeVariables() {
        respuesta = findViewById(R.id.rest);

        butt1 = findViewById(R.id.butt1);
        butt1.setText("suma");

        n1 = findViewById(R.id.intro1);
        n2 = findViewById(R.id.intro2);

        butt1.setOnClickListener(this);

    }
private void sumar()
{
    int valor1 = Integer.parseInt(n1.getText().toString());
    int valor2 = Integer.parseInt(n2.getText().toString());
    int r = valor1 + valor2;
    respuesta.setText("" + r);
}

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butt1:
                sumar();
                break;
        }
    }
}