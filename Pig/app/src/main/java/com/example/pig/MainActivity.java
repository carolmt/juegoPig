package com.example.pig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contador;
    int suma=0;
    int contador2;
    int suma2=0;
    boolean jugador1 = true;
    TextView contadorDeClics;
    TextView contadorDeClics2;
    Button augmentarElContador;
    Button reset;
    Button mantener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contadorDeClics = findViewById(R.id.contadorDeClics);
        contadorDeClics2 = findViewById(R.id.contadorDeClics2);
        augmentarElContador = findViewById(R.id.augmentarElContador);
        augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jugador1 == true) {
                    contador = (int) (Math.random() * 6 + 1);
                    suma = suma + contador;
                    contadorDeClics.setText("\n PUNTUACIÓN \n            " + suma);
                    jugador1 = false;
                        if(suma >= 100) {
                            contadorDeClics.setText("HAS GANADO");
                        }
                } else {
                    contador2 = (int) (Math.random() * 6 + 1);
                    suma2 = suma2 + contador2;
                    contadorDeClics2.setText("\n PUNTUACIÓN \n            " + suma2);
                        if(suma >= 100) {
                            contadorDeClics2.setText("HAS GANADO");
                        }
                    jugador1 = true;
                }
            }
        });
        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma = 0;
                contadorDeClics.setText("\n PUNTUACIÓN \n            " + suma);
                suma2 = 0;
                contadorDeClics2.setText("\n PUNTUACIÓN \n            " + suma2);
            }
        });
        mantener = findViewById(R.id.mantener);
        mantener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jugador1 == true) {
                    contadorDeClics.setText("\n PUNTUACIÓN \n            " + suma);
                    jugador1 = false;
                } else {
                    contadorDeClics2.setText("\n PUNTUACIÓN \n            " + suma2);
                    jugador1 = true;
                }
            }

        });
    }
}