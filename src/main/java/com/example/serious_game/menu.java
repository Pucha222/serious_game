package com.example.serious_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    Button btnButton, btnButton1, btnButton3, btnButton2, btnButton4;
    TextView mostrarJugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        setTitle("UNIVERSAL QUIZ!");

        /** botons **/
        btnButton = (Button) findViewById(R.id.button);
        btnButton1 = (Button) findViewById(R.id.button1);
        btnButton2 = (Button) findViewById(R.id.button2);
        btnButton3 = (Button) findViewById(R.id.button3);
        btnButton4 = (Button) findViewById(R.id.button4);

        mostrarJugador = findViewById(R.id.mostrarJugador);

        for(int y=0;y<MainActivity.arrayJugadors.size();y++){
            if(MainActivity.arrayJugadors.get(y).getJugadoractiu()){
                mostrarJugador.setText(MainActivity.arrayJugadors.get(y).getNom());
            }
        }


        /** activar activities **/
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, angles.class));
            }
        });

        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, mates.class));
            }
        });

        btnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, naturals.class));
            }
        });

        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, castella.class));
            }
        });

        btnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, taulaPeriodica.class));
            }
        });






    }
}