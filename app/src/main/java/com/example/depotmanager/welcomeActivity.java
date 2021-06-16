package com.example.depotmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toolbar;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent it = new Intent(this,choixStatus.class);

        //Utilisation du Timer pour demarrer l'activité choixStatus après 3.5 sec
        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
               startActivity(it);
            }
        }.start();
    }
}