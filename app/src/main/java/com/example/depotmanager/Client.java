package com.example.depotmanager;

public class Client {

    private String nom, prenom, dateCommande;

    public Client(String nom, String prenom, String dateCommande) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateCommande = dateCommande;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

}
