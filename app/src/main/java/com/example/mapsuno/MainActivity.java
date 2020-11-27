package com.example.mapsuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button btnTipos, btnUbicacion, btnsitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsitios = (Button)findViewById(R.id.btnSitiosT);
        btnsitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
        btnUbicacion = (Button) findViewById(R.id.btnU);
        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivityUbicacion.class);
                startActivity(intent);
            }
        });

        btnTipos = (Button) findViewById(R.id.btnTiposM);
        btnTipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivityTipos.class);
                startActivity(intent);
            }
        });

    }
}
