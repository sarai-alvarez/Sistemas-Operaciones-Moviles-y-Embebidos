package com.test.calculadora_basica;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttsum,buttrest, buttmul, buttdiv;
    private EditText n1, n2;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciazeVariables();
    }

    public void iniciazeVariables() {

        n1 = findViewById(R.id.intro1);
        n2 = findViewById(R.id.intro2);

        buttsum = findViewById(R.id.buttS);
        buttsum.setText(" + ");
        buttsum.setOnClickListener(this);

        buttrest = findViewById(R.id.buttR);
        buttrest.setText(" - ");
        buttrest.setOnClickListener(this);

        buttmul = findViewById(R.id.buttM);
        buttmul.setText(" * ");
        buttmul.setOnClickListener(this);

        buttdiv = findViewById(R.id.buttD);
        buttdiv.setText(" % ");
        buttdiv.setOnClickListener(this);

        respuesta = findViewById(R.id.tvrespuesta);

    }
    private void sumar()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r = valor1 + valor2;
        respuesta.setText("" + r);
    }

    private void restar()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r = valor1 - valor2;
        respuesta.setText("" + r);
    }

    private void multiplicacion()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r = valor1 * valor2;
        respuesta.setText("" + r);
    }

    private void divicion()
    {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int r = valor1 / valor2;
        respuesta.setText("" + r);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttS:
                sumar();
                break;
            case R.id.buttR:
                restar();
                break;
            case R.id.buttM:
                multiplicacion();
                break;
            case R.id.buttD:
                divicion();
                break;
        }
    }
}








