package com.example.appnevera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }
    public  void CrearUser(View v){
        EditText campo1 = this.findViewById(R.id.IDcorreo);
        EditText campo2 = this.findViewById(R.id.IDnombre);
        EditText campo3 = this.findViewById(R.id.Idpass);
        EditText campo4 = this.findViewById(R.id.Idpass2);
        String correo = campo1.getText().toString();
        String nombre = campo2.getText().toString();
        String pass = campo3.getText().toString();
        String pass2 = campo4.getText().toString();
        if (pass.equals(pass2)){
            Intent i = new Intent(this, Principal.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Las Contraseñas No Coinciden", Toast.LENGTH_SHORT).show();
        }

    }
    public  void volver(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}