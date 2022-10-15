package com.example.appnevera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class Temperatura extends AppCompatActivity {

    SeekBar seekBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        seekBar = (SeekBar) findViewById(R.id.seekBarTemp);
        textView = (TextView) findViewById(R.id.idValor);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                progress= progress-5;
                textView.setText(String.valueOf(progress)+"°");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public  void Principal(View v){
        Intent i = new Intent(this, Principal.class);
        startActivity(i);
    }
}