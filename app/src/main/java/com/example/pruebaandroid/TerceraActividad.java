package com.example.pruebaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TerceraActividad extends AppCompatActivity {

    private Button btnVolver2,btnMale,btnFemale;
    private String sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercera_activity);

        btnVolver2 = findViewById(R.id.btnVolver2);
        btnFemale = findViewById(R.id.btnFemale);
        btnMale = findViewById(R.id.btnMale);

        btnVolver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TerceraActividad.this, SegundaActividad.class);

                startActivity(intent);
            }
        });

        btnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TerceraActividad.this, SegundaActividad.class);

                String masculino = "Masculino";

                intent.putExtra("Sexo", masculino);

                startActivity(intent);
            }
        });

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
