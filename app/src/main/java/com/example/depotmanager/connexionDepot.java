package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class connexionDepot extends AppCompatActivity {

    TextView notificationDepot;
    EditText idDepot,pwdDepot;
    Button connexionDepot, inscriptionDepot;
    String chaineidDepot=null,chainePassDepot=null;

    Employe employe1, employe2, employe3;
    List<Employe> listeEmployes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion_depot);

        employe1= new Employe("Kamel","abcd");
        employe2 = new Employe("john","4321");
        employe3 = new Employe("Neyla","AbCd");

        listeEmployes = new ArrayList<Employe>();

        listeEmployes.add(employe1);
        listeEmployes.add(employe2);
        listeEmployes.add(employe3);

        idDepot = findViewById(R.id.saisieIDepot);
        pwdDepot = findViewById(R.id.saisiePASSDepot);
        connexionDepot = findViewById(R.id.btnConnexionDepot);
        inscriptionDepot = findViewById(R.id.btnInscriptionDepot);

        //Text et propriété du text de la notification
        notificationDepot = findViewById(R.id.notificationConnexionDepot);
        notificationDepot.setVisibility(View.INVISIBLE);
        notificationDepot.setTextColor(getResources().getColor(R.color.redColor));

        connexionDepot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chaineidDepot = idDepot.getText().toString();
                chainePassDepot = pwdDepot.getText().toString();

                Intent AccesDepot = new Intent(connexionDepot.this,profilUtilisateur.class);

                for (Employe e:listeEmployes) {
                    if(chaineidDepot.equals(e.getIdentifiant())&&chainePassDepot.equals(e.getMotDePass())){
                        Bundle b1= new Bundle();
                        b1.putString("user",chaineidDepot);
                        AccesDepot.putExtras(b1);
                        //Ajouter le Bundle et envoyer les données pour afficher le profil connecter puis envoyer les données pour l'enregistrement.
                        startActivity(AccesDepot);
                    }
                    else{
                        notificationDepot.setText("Mot de pass ou identifiant incorrect");
                        notificationDepot.setVisibility(View.VISIBLE);
                        new CountDownTimer(1500, 1000) {
                            public void onTick(long millisUntilFinished) {

                            }
                            public void onFinish() {
                                notificationDepot.setVisibility(View.INVISIBLE);
                            }
                        }.start();

                    }
                }

            }
        });

        Intent InscriptionDepot = new Intent(this,inscription.class);

        inscriptionDepot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(InscriptionDepot);
            }
        });

    }
}