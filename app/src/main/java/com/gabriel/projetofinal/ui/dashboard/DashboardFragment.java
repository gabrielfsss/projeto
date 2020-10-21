package com.gabriel.projetofinal.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.gabriel.projetofinal.MainActivity;
import com.gabriel.projetofinal.R;
import com.gabriel.projetofinal.telacadastro;
import com.gabriel.projetofinal.telamenuchat;
import com.gabriel.projetofinal.ui.home.HomeViewModel;

public class DashboardFragment extends Fragment {

    private ImageView icon_chat;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageView icon_chat = (ImageView) view.findViewById(R.id.icon_chat);
        icon_chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), telamenuchat.class);
                startActivity(i);
            }
        });

        return view;
    }


}