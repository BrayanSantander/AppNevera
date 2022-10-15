package com.example.appnevera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Soda extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda);
    }
    public void Servir(View v){
        Toast.makeText(this, "Sirviendo refresco", Toast.LENGTH_SHORT).show();
    }
}