package com.gabriel.projetofinal.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.gabriel.projetofinal.MainActivity;
import com.gabriel.projetofinal.telamenuchat;
import com.gabriel.projetofinal.R;

public class intentdashboard extends AppCompatActivity {

    private ImageView icon_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);

        icon_chat = (ImageView) findViewById(R.id.icon_chat);

        icon_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(intentdashboard.this, telamenuchat.class);
            }
        });
    }

}
