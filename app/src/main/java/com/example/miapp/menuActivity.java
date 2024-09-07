package com.example.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuActivity extends AppCompatActivity {

    private Button btnPerro;
    private TextView lblnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        lblnombre = (TextView)findViewById(R.id.lblNombre);
        btnPerro = (Button) findViewById(R.id.idPerro);
        Intent intent = getIntent();
        String nombre = intent.getExtras().getString("nombre");

        lblnombre.setText("Bienvenido " + nombre);

        btnPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explicito();
            }
        });
    }

    public void explicito(){
        Intent intent = new Intent(this,PerroActivity.class);
        startActivity(intent);
    }
}