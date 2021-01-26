package com.example.serious_game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class mates extends AppCompatActivity {

    Button btnButton1, btnButton2 , btnButton3 , btnButton4;
    TextView txtPregunta, txtComprovador;
    int randomArray, n_preguntes = 10, respostaCorrecte, respostaIncorrecte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mates);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setTitle("MATEMÀTIQUES");


        /** findviewbyids **/
        btnButton1 = (Button) findViewById(R.id.button1);
        btnButton2 = (Button) findViewById(R.id.button2);
        btnButton3 = (Button) findViewById(R.id.button3);
        btnButton4 = (Button) findViewById(R.id.button4);
        txtPregunta = (TextView) findViewById(R.id.pregunta);
        txtComprovador = (TextView) findViewById(R.id.comprovador);

        crearPregunta();

        /** activar buttons **/
        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.preguntesMates[randomArray].getSolucio().equalsIgnoreCase(btnButton1.getText().toString())){

                    String comprovacio = "<font color='#0BFF03'> CORRECTE! </font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaCorrecte++;

                }else{

                    String comprovacio = "<font color='#EE0000'>"+ MainActivity.preguntesMates[randomArray].getSolucio()+"</font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaIncorrecte++;


                }finalitzar();

                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        crearPregunta();
                    }
                }, 2000);

            }
        });

        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(MainActivity.preguntesMates[randomArray].getSolucio().equalsIgnoreCase(btnButton2.getText().toString())){

                    String comprovacio = "<font color='#0BFF03'> CORRECTE! </font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaCorrecte++;
                }else{

                    String comprovacio = "<font color='#EE0000'>"+ MainActivity.preguntesMates[randomArray].getSolucio()+"</font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaIncorrecte++;

                }finalitzar();
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        crearPregunta();
                    }
                }, 2000);

            }
        });

        btnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(MainActivity.preguntesMates[randomArray].getSolucio().equalsIgnoreCase(btnButton3.getText().toString())){

                    String comprovacio = "<font color='#0BFF03'> CORRECTE! </font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaCorrecte++;

                }else{

                    String comprovacio = "<font color='#EE0000'>"+ MainActivity.preguntesMates[randomArray].getSolucio()+"</font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaIncorrecte++;

                }finalitzar();
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        crearPregunta();
                    }
                }, 2000);

            }
        });

        btnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(MainActivity.preguntesMates[randomArray].getSolucio().equalsIgnoreCase(btnButton4.getText().toString())){

                    String comprovacio = "<font color='#0BFF03'> CORRECTE! </font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaCorrecte++;

                }else{

                    String comprovacio = "<font color='#EE0000'>"+ MainActivity.preguntesMates[randomArray].getSolucio()+"</font>";
                    txtComprovador.setText(Html.fromHtml(comprovacio));
                    respostaIncorrecte++;

                }finalitzar();
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        crearPregunta();
                    }
                }, 2000);


            }
        });



    }

    public void crearPregunta() {

        txtComprovador.setText(" ");
        //el *2 sera el nombre de respostes del array possibles
        randomArray = (int)(Math.random()*20);
        //numero random entre 1 i 4
        int randomBotons = (int)(Math.random()*4+1);

        while (MainActivity.preguntesMates[randomArray].isPreguntaRepe()==true){
            randomArray = (int)(Math.random()*20);
        }
        //MainActivity.preguntesAngles[randomArray].setPreguntaRepe(true);

        //pillem la paraula en catala(pregunta)
        txtPregunta.setText(MainActivity.preguntesMates[randomArray].getProblema());

        if(randomBotons == 1){
            //pregunta correcte
            btnButton1.setText(MainActivity.preguntesMates[randomArray].getSolucio());
            boolean sortidaBucle = false;
            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton2.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton3.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton4.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

        }else if(randomBotons == 2){

            //pregunta correcte
            btnButton2.setText(MainActivity.preguntesMates[randomArray].getSolucio());
            boolean sortidaBucle = false;
            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton1.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton3.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton4.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

        }else if(randomBotons == 3){

            //pregunta correcte
            btnButton3.setText(MainActivity.preguntesMates[randomArray].getSolucio());
            boolean sortidaBucle = false;
            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton2.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton1.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton4.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

        }else{

            //pregunta correcte
            btnButton4.setText(MainActivity.preguntesMates[randomArray].getSolucio());
            boolean sortidaBucle = false;
            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton2.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton3.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while

            sortidaBucle=false;

            while(sortidaBucle==false){
                int respostaIncorrecte = (int)(Math.random()*20);
                if(respostaIncorrecte != randomArray){
                    btnButton1.setText(MainActivity.preguntesMates[respostaIncorrecte].getSolucio());
                    sortidaBucle=true;
                }
            }//final while



        }

    }

    public void finalitzar(){
        n_preguntes --;
        if(n_preguntes<=0){
            AlertDialog alertDialog = new AlertDialog.Builder(mates.this).create();
            alertDialog.setTitle("Has acabat aquesta activitat!");
            alertDialog.setMessage("Has fet "+ respostaCorrecte +" de 10 punts!");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Click aquí per finalitzar!",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            finish();
                        }
                    });
            alertDialog.show();
        }
    }
}