package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class profilUtilisateur extends AppCompatActivity {

    private TextView identifiantProfil,statusConnexionProfil,statusProfil;
    private Button btnDeconnexion,btnConsulterListe, btnajouterCommande;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_utilisateur);

        Bundle b2 = getIntent().getExtras();
        identifiantProfil = findViewById(R.id.identifiantProfil);
        statusConnexionProfil = findViewById(R.id.statusConnexionProfil);
        statusProfil = findViewById(R.id.statusProfil);
        btnDeconnexion = findViewById(R.id.btnDeconnexion);
//        btnConsulterListe = findViewById(R.id.btnConsulter);
        btnajouterCommande = findViewById(R.id.btnAjouter);

        identifiantProfil.setText("ID: "+b2.getString("user"));
        statusConnexionProfil.setText("ACCÈS REUSSI");

        new CountDownTimer(2250, 1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
                statusConnexionProfil.setText("STATUS:");
                statusProfil.setText("En ligne");
            }
        }.start();

        btnDeconnexion.setOnClickListener(new View.OnClickListener() {
            Intent itProfilHome = new Intent(profilUtilisateur.this,choixStatus.class);

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous êtes déconnecté", Toast.LENGTH_SHORT).show();
                startActivity(itProfilHome);
            }
        });

       /* btnConsulterListe.setOnClickListener(new View.OnClickListener() {
            Intent itProfilListe = new Intent(profilUtilisateur.this,listeCommandes.class);
            @Override
            public void onClick(View v) {
                startActivity(itProfilListe);
            }
        });*/

        btnajouterCommande.setOnClickListener(new View.OnClickListener() {
            Intent itProfilAjoutForm = new Intent(profilUtilisateur.this, ajoutCommande.class);
            @Override
            public void onClick(View v) {
                startActivity(itProfilAjoutForm);
            }
        });




        //Envoyer les données d'un nouveau utilisateur à l'ctivité la ou c'est créer la liste
        //Affichage des boutton pour créer une liste de commandes
    }
}