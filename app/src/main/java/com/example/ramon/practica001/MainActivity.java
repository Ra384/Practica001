package com.example.ramon.practica001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varPalabra;
    TextView varLetrero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varPalabra = (EditText) findViewById(R.id.txtpalabra);
        varLetrero = (TextView) findViewById(R.id.txtletrero);

    }

    public void convertir(View v){
        String palabra =""+varPalabra.getText().toString();
        StringBuilder aux = new StringBuilder();
        aux.append(palabra);
        String nueva = aux.reverse().toString();
        varPalabra.setText(nueva);


    }
}
