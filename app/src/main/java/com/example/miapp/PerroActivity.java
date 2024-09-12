package com.example.miapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PerroActivity extends AppCompatActivity {

    private EditText edad;
    private TextView resultadoText;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perro);
        edad = (EditText) findViewById(R.id.idEdad);
        resultadoText = (TextView) findViewById(R.id.idLabel);
        enviar = (Button) findViewById(R.id.idCalcular);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edadvar = edad.getText().toString();
                if (!edadvar.isEmpty()){
                    int edadInt = Integer.parseInt(edadvar);
                    int resultado = edadInt * 7;
                    String resultadoString = "Si fueras perro, tu edad seria de : "+ resultado + " años";
                    resultadoText.setText(resultadoString);
                }else{
                    Toast.makeText(PerroActivity.this,"Debes insertar tu edad sapo y la ctmre",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}