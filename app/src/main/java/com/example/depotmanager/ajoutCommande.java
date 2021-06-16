package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class ajoutCommande extends AppCompatActivity {


    EditText referenceCommande, produit, date, fournisseur, destination;
    Button ajouterCommande, afficherListe;
    ArrayList<Commande> listeCommandesTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_commande);

        referenceCommande = findViewById(R.id.idRefCommande);
        produit=findViewById(R.id.idNomProduit);
        date=findViewById(R.id.idDateCommande);
        fournisseur=findViewById(R.id.idNomFournisseur);
        destination=findViewById(R.id.idNomClient);

        ajouterCommande =findViewById(R.id.btnAjouterSaisieCommande);
        afficherListe=findViewById(R.id.btnAfficherListeCommandes);

      /*  Intent intentAjoutCommandeListecommande = new Intent(this,listeCommandes.class);*/

        listeCommandesTest = new ArrayList<>();

        Intent intent = new Intent(this, listeCommandes.class);


        afficherListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    intent.putParcelableArrayListExtra("liste", listeCommandesTest);
                    //System.out.println("TEST::"+listeCommandesTest.get(0).getNomClient());
                    startActivity(intent);
                }
        });


        ajouterCommande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Bundle bsaisieCommande = new Bundle();

               /* bsaisieCommande.putString("refProduit",referenceCommande.getText().toString());
                bsaisieCommande.putString("nomPorduit",produit.getText().toString());
                bsaisieCommande.putString("dateCommande",date.getText().toString());
                bsaisieCommande.putString("nomFournisseur",fournisseur.getText().toString());
                bsaisieCommande.putString("nomDestination",destination.getText().toString());*/

                //bsaisieCommande.putParcelableArrayList("liste",listeCommandesTest);

              /*  String refCommande,nomProduit,dateCommande,nomFournisseur, nomDestination;
                refCommande = referenceCommande.getText().toString();
                nomProduit = produit.getText().toString();
                dateCommande = date.getText().toString();
                nomFournisseur = fournisseur.getText().toString();
                nomDestination =destination.getText().toString();*/

//              Commande cmdTest = new Commande(referenceCommande.getText().toString(),referenceCommande.getText().toString(),date.getText().toString(),fournisseur.getText().toString(),destination.getText().toString());

                listeCommandesTest.add(new Commande(referenceCommande.getText().toString(),referenceCommande.getText().toString(),date.getText().toString(),fournisseur.getText().toString(),destination.getText().toString()));
                //Commande reference ajouter avec succès

                Toast.makeText(getApplicationContext(),"Commande de référence: "+referenceCommande.getText().toString()+" ajoutée avec succès.", Toast.LENGTH_SHORT).show();

               /* intent.putParcelableArrayListExtra("liste", listeCommandesTest);
               *//* ArrayList<Commande> commandes;
                commandes = intent.getParcelableArrayListExtra("liste");*//*
                System.out.println("TEST::"+listeCommandesTest.get(0).getNomClient());
                startActivity(intent);*/
            }
        });
    }
}