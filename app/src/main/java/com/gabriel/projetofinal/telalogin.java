package com.gabriel.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class telalogin extends AppCompatActivity {

    Button botaoLogin;
    TextView textCadastro;
    ImageView ImageLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogin);

        botaoLogin = (Button) findViewById(R.id.botaoLogin);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(telalogin.this, MainActivity.class);
                startActivity(i);
            }
        });

        textCadastro = (TextView) findViewById(R.id.textCadastro);

        textCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(telalogin.this, telacadastro.class);
                startActivity(i);
            }
        });

        ImageLogo = (ImageView) findViewById(R.id.ImageLogo);

        ImageLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(telalogin.this, telamenuchat.class);
                startActivity(i);
            }
        });


    }
}