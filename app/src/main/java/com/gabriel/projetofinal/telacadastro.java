package com.gabriel.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telacadastro extends AppCompatActivity {

    Button botaoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastro);

        botaoCadastro = (Button) findViewById(R.id.botaoCadastro);

        botaoCadastro.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(telacadastro.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}