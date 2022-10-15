package com.example.appnevera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void login(View v){
        EditText campo1 = this.findViewById(R.id.IDnom);
        EditText campo2 = this.findViewById(R.id.IDpass);
        String nombre = campo1.getText().toString();
        String pass = campo2.getText().toString();
        if (nombre.equals("User")&&(pass.equals("1234"))){
            Intent i = new Intent(this, Principal.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Error En Credenciales", Toast.LENGTH_SHORT).show();
        }

    }
    public  void CrearCuenta(View v){
        Intent i = new Intent(this, CrearCuenta.class);
        startActivity(i);
    }
}