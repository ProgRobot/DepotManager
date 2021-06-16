package com.example.depotmanager;

import android.os.Parcel;
import android.os.Parcelable;

public class Commande implements Parcelable {

    private String referenceCommande, nomProduit, dateCommande,nomFournisseur,nomClient;

    public Commande() {
    }

    public Commande(String referenceCommande, String nomProduit, String dateCommande, String nomFournisseur, String nomClient) {
        this.referenceCommande = referenceCommande;
        this.nomProduit = nomProduit;
        this.dateCommande = dateCommande;
        this.nomFournisseur = nomFournisseur;
        this.nomClient = nomClient;
    }


    public String getReferenceCommande() {
        return referenceCommande;
    }

    public void setReferenceCommande(String referenceCommande) {
        this.referenceCommande = referenceCommande;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
/*
    public static Creator<Commande> getCREATOR() {
        return CREATOR;
    }*/

    protected Commande(Parcel in) {
        referenceCommande = in.readString();
        nomProduit = in.readString();
        dateCommande = in.readString();
        nomFournisseur = in.readString();
        nomClient = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(referenceCommande);
        dest.writeString(nomProduit);
        dest.writeString(dateCommande);
        dest.writeString(nomFournisseur);
        dest.writeString(nomClient);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Commande> CREATOR = new Creator<Commande>() {
        @Override
        public Commande createFromParcel(Parcel in) {
            return new Commande(in);
        }

        @Override
        public Commande[] newArray(int size) {
            return new Commande[size];
        }
    };

    @Override
    public String toString() {
        return "Commande{" +
                "referenceCommande='" + referenceCommande + '\'' +
                ", nomProduit='" + nomProduit + '\'' +
                ", dateCommande='" + dateCommande + '\'' +
                ", nomFournisseur='" + nomFournisseur + '\'' +
                ", nomClient='" + nomClient + '\'' +
                '}';
    }
}
