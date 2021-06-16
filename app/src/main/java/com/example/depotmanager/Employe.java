package com.example.depotmanager;

public class Employe {

    private String identifiant, motDePass;

    public Employe(String identifiant, String motDePass) {
        this.identifiant = identifiant;
        this.motDePass = motDePass;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }
}
