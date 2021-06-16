package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;

public class choixStatus extends AppCompatActivity {

    private Button btnDepot=null,btnFournisseur=null;
    private Intent itLoginDepot=null, itLoginFournisseur = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_status);

        btnDepot = (Button) findViewById(R.id.btDepot);
        btnFournisseur = (Button) findViewById(R.id.btfournisseur);

        itLoginDepot = new Intent(this,connexionDepot.class);
        itLoginFournisseur = new Intent(this,connexionFournisseur.class);

        btnFournisseur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(itLoginFournisseur);
            }
        });

        btnDepot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(itLoginDepot);
            }
        });

    }


}