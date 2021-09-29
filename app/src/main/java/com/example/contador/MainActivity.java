package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador;
    private TextView Numero = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
        Numero = (TextView) findViewById(R.id.txt_numero);
    }

    public void contar(View view)
    {
        contador ++;
        Numero.setText(String.valueOf(contador));
    }

    public void reset(View view)
    {
        contador = 0;
        Numero.setText("0");
    }
}