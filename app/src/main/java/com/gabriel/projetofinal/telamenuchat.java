package com.gabriel.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class telamenuchat extends AppCompatActivity {

    RelativeLayout relativePerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telamenuchat);
        getSupportActionBar().hide();

    relativePerfil = (RelativeLayout) findViewById(R.id.relativePerfil);

    relativePerfil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(telamenuchat.this, telachat.class);
            startActivity(i);
        }
    });
    }
}