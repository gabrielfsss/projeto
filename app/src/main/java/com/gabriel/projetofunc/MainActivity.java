package com.gabriel.projetofunc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button proxTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proxTela = (Button) findViewById(R.id.proxTela); //Criar uma variável para o Button criado no XML

        proxTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, proxTela.class); // Dentro dos parenteses coloca o nome da activity que você está e a activity que você quer ir, respectivamente
                startActivity(i); // Iniciar activity
            }
        });
    }
}