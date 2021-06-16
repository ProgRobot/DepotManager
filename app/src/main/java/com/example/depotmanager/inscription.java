package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class inscription extends AppCompatActivity {

    private EditText identifiantInscription = null, pwd=null, confirmationPwd=null;
    private Button btnInscription;
    private RadioGroup status;
    private RadioButton radioDepot,radioFournisseur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        identifiantInscription = findViewById(R.id.saisieIDinscription);
        pwd = findViewById(R.id.saisiePwdInscription);
        confirmationPwd = findViewById(R.id.confirmationPWDinscription);
        btnInscription = findViewById(R.id.btnInscription);

        radioDepot = findViewById(R.id.radioDepot);
        radioFournisseur = findViewById(R.id.radioFournisseur);

        btnInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pwd.getText().toString().equals(confirmationPwd.getText().toString()) && !pwd.getText().toString().isEmpty() && !confirmationPwd.getText().toString().isEmpty()) {
                    if(radioDepot.isChecked()){
                        Intent intInscriptionLogin=new Intent(inscription.this,connexionDepot.class);
                        startActivity(intInscriptionLogin);
                    }
                    else if (radioFournisseur.isChecked()){
                        Intent intInscriptionLogin=new Intent(inscription.this,connexionFournisseur.class);
                        startActivity(intInscriptionLogin);
                    }
                }
            }
        });
    }
}