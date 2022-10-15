package com.example.appnevera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public  void Temperatura(View v){
        Intent i = new Intent(this, Temperatura.class);
        startActivity(i);
    }
    public  void Registro(View v){
        Intent i = new Intent(this, Registros.class);
        startActivity(i);
    }
    public  void Soda(View v){
        Intent i = new Intent(this, Soda.class);
        startActivity(i);
    }
    public  void Rendimiento(View v){
        Intent i = new Intent(this, Rendimiento.class);
        startActivity(i);
    }
}