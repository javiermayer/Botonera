package com.example.javier.prueba;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public  MediaPlayer reproductor1;
    public  MediaPlayer reproductor;
    public  MediaPlayer reproductor2;
    public  MediaPlayer reproductor3;
    public  MediaPlayer reproductor4;
    public  MediaPlayer reproductor5;
    public  MediaPlayer reproductor6;
    public  MediaPlayer reproductor7;
    public  MediaPlayer reproductor8;
    public  MediaPlayer reproductor9;
    public  MediaPlayer reproductor10;




    int x = (int) Math.floor(Math.random()*(0-10+1)+10);
    Random rnd = new Random();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




            InputStream fraw = getResources().openRawResource(R.raw.sonido1);               //desde aca hasta donde termima la barra es donde esta el error
            BufferedReader brin = new BufferedReader(new InputStreamReader(fraw));          // no se como mandar el audio que se encuentra en recurosos por el intent , no se que
           // linea = brin.readLine();                                                      //que uri poner
            Uri uri = Uri.parse(String.valueOf(brin)+".mp3");

        final Intent compartiraudio = new Intent(Intent.ACTION_SEND);
        compartiraudio.setType("audio/mp3");
        compartiraudio.putExtra(Intent.EXTRA_STREAM, uri);                                  // fin del codifo donde creo que tengo el error.



        final ArrayList<MediaPlayer>listaReproductores= new ArrayList<MediaPlayer>();
        Button botonRandom = (Button)findViewById(R.id.puteadaRandom);
        Button boton1 = (Button)findViewById(R.id.imagen);
        Button boton2 = (Button)findViewById(R.id.imagen1);
        Button boton3 = (Button)findViewById(R.id.imagen2);
        Button boton4 = (Button)findViewById(R.id.imagen3);
        Button boton5 = (Button)findViewById(R.id.imagen4);
        Button boton6 = (Button)findViewById(R.id.imagen4);
        Button boton7 = (Button)findViewById(R.id.imagen4);
        Button boton8 = (Button)findViewById(R.id.imagen4);
        reproductor= MediaPlayer.create(this,R.raw.sonido1);
        listaReproductores.add(reproductor);

        reproductor1= MediaPlayer.create(this,R.raw.sonido1);
        listaReproductores.add(reproductor1);

        reproductor2= MediaPlayer.create(this,R.raw.sonido2);
        listaReproductores.add(reproductor2);

        reproductor3= MediaPlayer.create(this,R.raw.sonido3);
        listaReproductores.add(reproductor3);

        reproductor3= MediaPlayer.create(this,R.raw.sonido1);
        listaReproductores.add(reproductor3);

        reproductor4= MediaPlayer.create(this,R.raw.sonido2);
        listaReproductores.add(reproductor4);

        reproductor5= MediaPlayer.create(this,R.raw.sonido1);
        listaReproductores.add(reproductor5);

        reproductor6= MediaPlayer.create(this,R.raw.sonido2);
        listaReproductores.add(reproductor6);

        reproductor7= MediaPlayer.create(this,R.raw.sonido3);
        listaReproductores.add(reproductor7);

        reproductor8= MediaPlayer.create(this,R.raw.sonido3);
        listaReproductores.add(reproductor8);

        reproductor9= MediaPlayer.create(this,R.raw.sonido2);
        listaReproductores.add(reproductor9);

        reproductor10= MediaPlayer.create(this,R.raw.sonido1);
        listaReproductores.add(reproductor10);





        botonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaReproductores.get(x).start();
                startActivity(Intent.createChooser(compartiraudio, "Comparti con tus amigos"));
                x = 0;
                x = (int) Math.floor(Math.random() * (0 - 10 + 1) + 10);

            }
        });








        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor1.start();


            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"toust",Toast.LENGTH_LONG).show();
                reproductor2.start();


            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor3.start();

            }

        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor4.start();

            }

        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor5.start();

            }

        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor6.start();

            }

        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor7.start();

            }

        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "toust", Toast.LENGTH_LONG).show();
                reproductor8.start();

            }

        });
        boton1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                startActivity(Intent.createChooser(compartiraudio, "comparti co tus amigos"));

                return false;
            }
        });
        boton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                startActivity(Intent.createChooser(compartiraudio, "Comparti con tus amigos"));

                return false;
            }
        });
        boton3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                startActivity(Intent.createChooser(compartiraudio, "Comparti con tus amigos"));

                return false;
            }
        });
        boton4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                startActivity(Intent.createChooser(compartiraudio, "Comparti con tus amigos"));

                return false;
            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void reproduccionRandom(){


    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
