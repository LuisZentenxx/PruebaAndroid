package com.example.pruebaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {

    private TextView txtBienvenida,txtGenero,txtNombre;
    private Button btnVolver,btnIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);

        txtBienvenida = findViewById(R.id.txtBienvenida);
        txtGenero = findViewById(R.id.txtGenero);
        txtNombre = findViewById(R.id.txtNombre);
        btnVolver = findViewById(R.id.btnVolver);
        btnIr = findViewById(R.id.btnIr);

        //Volver a Main Activity
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(SegundaActividad.this, MainActivity.class);

                startActivity(intent);
            }
        });

        //Traer los datos de Main Activity y mostrarlos
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("Nombre");
        txtBienvenida.setText("BIENVENIDO " + nombre);

        if (nombre==nombre){
            String masculino = intent.getStringExtra("Sexo");
            txtGenero.setText(masculino);
            String femenino = intent.getStringExtra("Sexo");
            txtGenero.setText(femenino);

            txtNombre.setText(nombre);
        }


        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(SegundaActividad.this, TerceraActividad.class);

                startActivity(intent1);
            }
        });




    }
}
