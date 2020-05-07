package com.example.examenhito3.onboarding;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.examenhito3.R;
import com.example.examenhito3.contenedor.calcu;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginFragment extends Fragment {
    public EditText etusername,pass;
    public Button basica,cientifica,custom, Selecbasica,Seleccientifica,bcustom,btniniciar;
    private View view;
    public loginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        iniciar();
        setMensaje();
        return view;
    }
    public void iniciar()
    {

        Selecbasica = view.findViewById(R.id.Selecbasica);
        Seleccientifica = view.findViewById(R.id.Seleccientifica);
        cientifica = view.findViewById(R.id.cientifica);
        basica = view.findViewById(R.id.basica);
        custom = view.findViewById(R.id.custom);
        bcustom= view.findViewById(R.id.bcustom);
        etusername = view.findViewById(R.id.etUsername);
        pass = view.findViewById(R.id.etPassword);
        btniniciar = view.findViewById(R.id.btnLogin);
    }
    public void setMensaje() {


        Selecbasica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                pass.setText("Basico");
            }
        });
        basica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "basica", Toast.LENGTH_SHORT).show();
            }
        });
        cientifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "cientifica", Toast.LENGTH_SHORT).show();
            }
        });
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "calculadora custom", Toast.LENGTH_SHORT).show();
            }
        });
        Seleccientifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            { pass.setText("Cientifico"); }
        });

        bcustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {  pass.setText("Costum");      }
        });

        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String username = etusername.getText().toString().trim();
                String selectup1 = pass.getText().toString().trim();
                if (selectup1.equals("Select Up")|| username.equals("Username") )
                {
                    Toast.makeText(getActivity(),"selecione las casillas",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(getActivity(), calcu.class);
                    intent.putExtra("APP: ",selectup1 );
                    intent.putExtra("Bienvenido: ",username );
                    startActivity(intent);
                    getActivity().finish();
                }
            }
        });
    }

}
