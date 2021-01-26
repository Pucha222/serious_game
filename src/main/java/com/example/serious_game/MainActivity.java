package com.example.serious_game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //variables
    Button btnButton1, btnButton2, btncrearJugador;

    static ArrayList <jugador> arrayJugadors = new ArrayList<>();

    //angles
    static traductorAngles preguntesAngles[] = new traductorAngles[]{
            new traductorAngles("Casa","House"),
            new traductorAngles("Carrer", "Street"),
            new traductorAngles("Gos", "Dog"),
            new traductorAngles("Gat", "Cat"),
            new traductorAngles("Peu", "Foot"),
            new traductorAngles("Granota", "Frog"),
            new traductorAngles("Llàpis", "Pencil"),
            new traductorAngles("Ordinador", "Computer"),
            new traductorAngles("Avió", "Plane"),
            new traductorAngles("Moto", "Motorbike"),
            new traductorAngles("Cotxe", "Car"),
            new traductorAngles("Traje de bany", "Swimsuit"),
            new traductorAngles("Picina", "Swimming pool"),
            new traductorAngles("Patinet", "Scooter"),
            new traductorAngles("Pupitre", "Desk"),
            new traductorAngles("Taula", "Table"),
            new traductorAngles("Caixa", "Box"),
            new traductorAngles("Amic", "Friend"),
            new traductorAngles("Mare", "Mom"),
            new traductorAngles("Pare", "Dad"),
            new traductorAngles("Ratolí", "Mouse"),
            new traductorAngles("Casc", "Helmet"),

    };

    //mates
    static solucionsMates preguntesMates[] = new solucionsMates[]{
            new solucionsMates("10+2","12"),
            new solucionsMates("4+7", "11"),
            new solucionsMates("6+8", "14"),
            new solucionsMates("12+12", "24"),
            new solucionsMates("0+34", "34"),
            new solucionsMates("999+0","999"),
            new solucionsMates("32-1", "31"),
            new solucionsMates("45-10", "35"),
            new solucionsMates("12+3-10", "5"),
            new solucionsMates("12+12+15", "39"),
            new solucionsMates("10+2+10-22","0"),
            new solucionsMates("4+7+7-28", "-10"),
            new solucionsMates("6-47", "-39"),
            new solucionsMates("6*6", "36"),
            new solucionsMates("2*2+12", "16"),
            new solucionsMates("10*2","20"),
            new solucionsMates("(70+7)*10", "770"),
            new solucionsMates("63-33", "30"),
            new solucionsMates("25+25", "50"),
            new solucionsMates("10*40*20", "8000"),
            new solucionsMates("45/5","9"),
            new solucionsMates("(4+4+4+4)-6", "10"),
            new solucionsMates("60*2", "120"),
            new solucionsMates("10*45", "450"),
            new solucionsMates("1*1*1", "1"),

    };

    //natus
    static solucionsNaturals preguntesNaturals[] = new solucionsNaturals[]{
            new solucionsNaturals("Estrella del sistema solar?","Sol"),
            new solucionsNaturals("Animal més gros del planeta?", "Balena blava"),
            new solucionsNaturals("Animal terrestre més gros del planeta?", "Elefant"),
            new solucionsNaturals("Animal més ràpid del planeta?", "Àguila reial"),
            new solucionsNaturals("Planeta més gros del sistema solar?", "Júpiter"),
            new solucionsNaturals("Planeta més petit del sistema solar?", "Neptú"),
            new solucionsNaturals("Forma més petita de vida coneguda?", "Cèl·lula"),
            new solucionsNaturals("Animal més dormilega?", "Perezós"),
            new solucionsNaturals("part del cap humà feta de cartílag?", "orelles"),
            new solucionsNaturals("Animal semi-volador mamífer?", "esquirol volador"),
            new solucionsNaturals("peix molt bó i reconegut a la cuina occidental", "Tonyina"),
            new solucionsNaturals("peix verinós típic del mediterràni", "Escórpora"),
            new solucionsNaturals("Animal marí que sembla una verdura i no ho és?", "Cogómbre marí"),
            new solucionsNaturals("Plata no és, or tampoc però el color s'hi assembla, què és?", "Plàtan"),
            new solucionsNaturals("Mamífer  que posa ous?", "Ornitorrinc"),
            new solucionsNaturals("Planeta més calent del sistema solar?", "Mercuri"),
            new solucionsNaturals("Animal més lent terrestre?", "tortuga"),
            new solucionsNaturals("Com s'anomenen els animals que menjen carn?", "Carnívors"),
            new solucionsNaturals("Com s'anomenen els animals que menjen plantes?", "Herbívors"),
            new solucionsNaturals("Com s'anomenen els animals que menjen de tot?", "Omnívors"),


    };

    //caste
    static solucionsCastella preguntesCastella[] = new solucionsCastella[]{
            new solucionsCastella("Cuc","gusano"),
            new solucionsCastella("Ordinador","ordenador"),
            new solucionsCastella("peu","pié"),
            new solucionsCastella("porc","cerdo"),
            new solucionsCastella("Ratolí","ratón"),
            new solucionsCastella("clau","llave"),
            new solucionsCastella("cotxe","coche"),
            new solucionsCastella("amic","amigo"),
            new solucionsCastella("ballar","bailar"),
            new solucionsCastella("taula","mesa"),
            new solucionsCastella("mà","mano"),
            new solucionsCastella("humà","humano"),
            new solucionsCastella("tradició","tradicion"),
            new solucionsCastella("teclat","teclado"),
            new solucionsCastella("universitat","universidad"),
            new solucionsCastella("alumne","alumno"),
            new solucionsCastella("cruiximents","agujetas"),
            new solucionsCastella("ase","asno"),
            new solucionsCastella("ceba","cebolla"),
            new solucionsCastella("verge","virgen"),
            new solucionsCastella("déu","dios"),
            new solucionsCastella("deu","diez"),
            new solucionsCastella("nou","nueve"),
            new solucionsCastella("anou","nuez"),
            new solucionsCastella("coll","cuello"),
            new solucionsCastella("cambrer","camarero"),






    };

    //taulaperiodica
    static solucionsTaulaPeriodica preguntesTaulaPeriodica[] = new solucionsTaulaPeriodica[]{
            new solucionsTaulaPeriodica("V","Vanadi"),
            new solucionsTaulaPeriodica("Pd","Pal·ladi"),
            new solucionsTaulaPeriodica("Li","Liti"),
            new solucionsTaulaPeriodica("Ca","Calci"),
            new solucionsTaulaPeriodica("Número 11","Sodi"),
            new solucionsTaulaPeriodica("Número 24","Crom"),
            new solucionsTaulaPeriodica("Número 29","Coure"),
            new solucionsTaulaPeriodica("Número 5","Bor"),
            new solucionsTaulaPeriodica("Número 30","Zinc"),
            new solucionsTaulaPeriodica("Número 76","Osmi"),
            new solucionsTaulaPeriodica("Número 55","Cesi"),
            new solucionsTaulaPeriodica("Número 88","Radi"),
            new solucionsTaulaPeriodica("Fr","Franci"),
            new solucionsTaulaPeriodica("Zr","Zirconi"),
            new solucionsTaulaPeriodica("Ti","Titani"),
            new solucionsTaulaPeriodica("Sr","Estronci"),
            new solucionsTaulaPeriodica("K","Potassi"),
            new solucionsTaulaPeriodica("Número 45","Rodi"),
            new solucionsTaulaPeriodica("Número 78","Platí"),
            new solucionsTaulaPeriodica("Número 79","Or"),
            new solucionsTaulaPeriodica("Hg","Mercuri"),
            new solucionsTaulaPeriodica("In","Indi"),
            new solucionsTaulaPeriodica("Sn","Estany"),
            new solucionsTaulaPeriodica("Ge","Germani"),
            new solucionsTaulaPeriodica("Número 15","Fósfor"),






    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("UNIVERSAL QUIZ!");


        /** botons **/
        btnButton1 = (Button) findViewById(R.id.button1);
        btnButton2 = (Button) findViewById(R.id.button2);
        btncrearJugador = (Button) findViewById(R.id.btncrearJugador);



        /** activar activities **/
        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean existeixJugador=true;
                boolean jugadorActiu = false;
                int x;

                if(arrayJugadors.size()==0){

                    existeixJugador = false;

                }

                for(x = 0;x<arrayJugadors.size();x++){
                    if(arrayJugadors.get(x).getJugadoractiu() == true){
                        jugadorActiu = true;
                        break;
                    }
                }

                if(existeixJugador == false){

                    startActivity(new Intent(MainActivity.this, crearJugador.class));

                }else{

                     startActivity(new Intent(MainActivity.this, menu.class));
                }
            }
        });

        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, info.class));
            }
        });

        btncrearJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, crearJugador.class));
            }
        });





    }




}