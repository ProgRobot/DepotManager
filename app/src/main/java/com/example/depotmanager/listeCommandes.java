package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class listeCommandes extends AppCompatActivity {


    private ArrayList<String> commandes;
    private PlaneteAdapter adapter;
    private ListView listview;
    private TextView infosCommande;

    public void installationListeDeCommande() {

        commandes = new ArrayList<String>();
        commandes.add("CMD2154:13/01/2021");
        commandes.add("CMD3621:05/03/2021");
        commandes.add("CMD9845:02/04/2021");
        commandes.add("CMD0254:08/03/2021");
        commandes.add("CMD1524:04/05/2020");
        commandes.add("CMD5469:22/04/2021");
        commandes.add("CMD4165:01/02/2021");

       /* Intent intent = getIntent();
        ArrayList<Commande> commandesRecues;
        commandesRecues = intent.getParcelableArrayListExtra("liste");
        for(Commande v : commandesRecues){
            commandes.add(commandesRecues.);
        }*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_commandes);

        //Installation de la liste des commandes
        installationListeDeCommande();

        //Reccuperation du Layout de la liste de commandes

        listview = (ListView) findViewById(R.id.listeCommandesView);
        adapter = new PlaneteAdapter();
        listview.setAdapter(adapter);
    }

    private class PlaneteAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return commandes.size();
        }

        @Override
        public Object getItem(int arg0) {
            return commandes.get(arg0);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater)
                        listeCommandes.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                itemView = inflater.inflate(R.layout.listitem, null);
            }
            infosCommande = (TextView) itemView.findViewById(R.id.textInfosCommande);
            final CheckBox checkBox = (CheckBox) itemView.findViewById(R.id.checkboxSelectionCommande);
            final Spinner spinner = (Spinner) itemView.findViewById(R.id.spinnerStatusCommande);
            infosCommande.setText(commandes.get(position));

            String[] statusCommande = {"Receptionnée", "Non réceptionnée"};
            final ArrayAdapter<String> spinadapter = new ArrayAdapter<String>(listeCommandes.this,
                    android.R.layout.simple_spinner_item, statusCommande);
            spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(spinadapter);

           /* checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    CheckBox checkBox = (CheckBox) compoundButton.findViewById(R.id.checkbox);
                    if (checkBox.isChecked()) {
                        spinner.setEnabled(false);
                        spinadapter.notifyDataSetChanged();
                    } else {
                        spinner.setEnabled(true);
                        spinadapter.notifyDataSetChanged();
                    }
                }
            });*/
            return itemView;
        }
    }

 /*   private ListView Liste;

    //dans notre acyivité principale on va récupérer notre listeView
    //et lui affecter un adaptateur grace à la méthode SETADPTER

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_commandes);

        //Création d'une liste d'elements (Des chaines de caractères)
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Réf-KZM2-");
        elements.add("élément2");

        //Réccupération de la liste du Layout Liste
        Liste = (ListView) findViewById(R.id.liste);

        // créer un adaptateur de données et lui passer la liste de chaine de carctères
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,elements);

        //Ajouter l'adaptateur à notre liste "liste"
        Liste.setAdapter(adapter);
        //Gestion du click sur un élément de la lsite

        Liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("MyTag","L'élément" + position + "a été cliqué");
                String contenu = Liste.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"La commande N° " + position+ " a été cliqué. Son contenu est : "+ contenu,Toast.LENGTH_LONG).show();
            }
        });
    }
*/

    /*TextView affichageListe;
    List<Commande> listeCommandes;
    String chaineListe="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_commandes);

        affichageListe = findViewById(R.id.affichageListe);

        *//*Bundle bundleReccuperationDonneCommande = getIntent().getExtras();*//*

        *//*Commande c = new Commande(bundleReccuperationDonneCommande.getString("refProduit"),bundleReccuperationDonneCommande.getString("nomPorduit"),bundleReccuperationDonneCommande.getString("dateCommande"),bundleReccuperationDonneCommande.getString("nomFournisseur"),bundleReccuperationDonneCommande.getString("nomDestination"));*//*
       *//* listeCommandes = new ArrayList();*//*
        *//*listeCommandes.add(c);*//*

        //Exemple4 : Afficher une liste d'objets parcelable

        Intent intent = getIntent();
        ArrayList<Commande> commandes;
        commandes = intent.getParcelableArrayListExtra("liste");
        //TEST RECEPTION
        System.out.println("TEST RECEPTION:: "+commandes.get(0).getNomClient());

        for(Commande v : commandes){
            System.out.println(v.toString());
            chaineListe.concat(v.toString());
        }

        affichageListe.setText(chaineListe);

        //affichageListe = findViewById(R.id.listeCommandes);

    }*/
}