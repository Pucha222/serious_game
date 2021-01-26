package com.example.serious_game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class crearJugador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_jugador);

        Button button5;
        final EditText textJugador;

        button5 = (Button) findViewById(R.id.button5);
        textJugador = (EditText) findViewById(R.id.textJugador);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String player;
                player = textJugador.getText().toString();

                if(!player.isEmpty()){

                    desactivarAnticPlayer();

                    MainActivity.arrayJugadors.add(new jugador(player,0,true));

                    startActivity(new Intent(crearJugador.this, menu.class));



                }else{

                    AlertDialog alertDialog = new AlertDialog.Builder(crearJugador.this).create();
                    alertDialog.setTitle("ESCRIU UN NOM!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Continuar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                }



            }
        });

    }

    public void desactivarAnticPlayer(){


        for(int x=0; x<MainActivity.arrayJugadors.size();x++){

            if(MainActivity.arrayJugadors.get(x).getJugadoractiu()==true){

                MainActivity.arrayJugadors.get(x).setJugadoractiu(false);

            }

        }



    }


}