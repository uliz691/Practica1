package com.example.ulises.practica;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ejemplo extends AppCompatActivity {
    Button btn_cont,btn_reset, btn_dis;
    static int contador;
    TextView pant;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = getApplicationContext();

        Toast.makeText(context,"onCreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);
        btn_cont = (Button)findViewById(R.id.btn_contador);
        btn_dis = (Button)findViewById(R.id.dis);
        btn_reset = (Button)findViewById(R.id.reset);
        pant = (TextView) findViewById(R.id.pantalla);

        btn_cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                sumarPuntos(contador);
                Toast.makeText(context,"Aumentar", Toast.LENGTH_SHORT).show();
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador=0;
                sumarPuntos(contador);
                Toast.makeText(context,"reset", Toast.LENGTH_SHORT).show();
            }
        });
        btn_dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                sumarPuntos(contador);
                Toast.makeText(context,"Disminuir", Toast.LENGTH_SHORT).show();
            }
        });

    }

    protected void onStart(){
        super.onStart();
        context = getApplicationContext();
        Toast.makeText(context,"onStart", Toast.LENGTH_SHORT).show();

    }
    protected void onResume(){
        super.onResume();
        context = getApplicationContext();
        Toast.makeText(context,"onResume", Toast.LENGTH_SHORT).show();

    }
    protected void onPause(){
        super.onPause();
        context = getApplicationContext();
        Toast.makeText(context,"onPause", Toast.LENGTH_SHORT).show();

    }
    protected void onStop(){
        super.onStop();
        context = getApplicationContext();
        Toast.makeText(context,"onStop", Toast.LENGTH_SHORT).show();

    }
    protected void onDestroy(){
        super.onDestroy();
        context = getApplicationContext();
        Toast.makeText(context,"onDestroy", Toast.LENGTH_SHORT).show();

    }
    public void sumarPuntos(int contador){
        pant.setText("Contador: "+contador);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("contador",contador);
    }

   @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        contador = savedInstanceState.getInt("contador");
        pant.setText("Contador: "+contador);
    }
}
