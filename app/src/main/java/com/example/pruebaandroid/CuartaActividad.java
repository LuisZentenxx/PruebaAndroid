package com.example.pruebaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CuartaActividad extends AppCompatActivity {

    private Button btnMain,btnSegunda,btnTercera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuarta_activity);

        btnMain = findViewById(R.id.btnMain);
        btnSegunda = findViewById(R.id.btnSegunda);
        btnTercera = findViewById(R.id.btnTercera);

        // Volver a Main Activity
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CuartaActividad.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Volver a Segunda Activity
        btnSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CuartaActividad.this, SegundaActividad.class);
                startActivity(intent);
            }
        });

        // Volver a Tercera Activity
        btnTercera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CuartaActividad.this, TerceraActividad.class);
                startActivity(intent);
            }
        });

    }
}
