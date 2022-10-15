package com.example.appnevera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Rendimiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendimiento);
    }

    public void calcularEficiencia(){
        EditText campo1 = this.findViewById(R.id.temperatura);
        EditText campo2 = this.findViewById(R.id.TempNevera);
        int tempAmb = Integer.parseInt(campo1.getText().toString());
        int tempNev = Integer.parseInt(campo2.getText().toString());


    }
}