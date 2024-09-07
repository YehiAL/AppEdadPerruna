package com.example.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnContinuar;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtNombre = (EditText) findViewById(R.id.idNombre);
        btnContinuar = (Button) findViewById(R.id.idContinuar);
        btnSalir = (Button) findViewById(R.id.idSalir);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explicito();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void explicito (){
        Intent intent = new Intent(this,menuActivity.class);
        String nombreparametro = txtNombre.getText().toString();
        intent.putExtra("nombre",nombreparametro);
        startActivity(intent);
    }

}