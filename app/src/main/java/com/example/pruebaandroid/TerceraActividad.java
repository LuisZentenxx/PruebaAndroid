package com.example.pruebaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TerceraActividad extends AppCompatActivity {

    private Button btnVolver2,btnMale,btnFemale,btnIr2;
    private String sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercera_activity);

        btnVolver2 = findViewById(R.id.btnVolver2);
        btnFemale = findViewById(R.id.btnFemale);
        btnMale = findViewById(R.id.btnMale);
        btnIr2 = findViewById(R.id.btnIr2);

        //Volver a la segunda actividad
        btnVolver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TerceraActividad.this, SegundaActividad.class);

                startActivity(intent);
            }
        });

        btnIr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TerceraActividad.this, CuartaActividad.class);
                startActivity(intent);
            }
        });

        //Boton de genero masculino
        btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TerceraActividad.this, SegundaActividad.class);

                String masculino = "Masculino";

                intent.putExtra("Sexo", masculino);

                startActivity(intent);
            }
        });

        //Boton de genero femenino
        btnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TerceraActividad.this, SegundaActividad.class);
                String femenino = "Femenino";
                intent.putExtra("Sexo",femenino);

                startActivity(intent);
            }
        });


    }
}
