package com.example.depotmanager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

    private EditText nom,prenom,age;
    private TextView phrase;
    private Button btnEnregistrer;
    private Spinner ville;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.txtNom);
        prenom = findViewById(R.id.txtPrenom);
        age = findViewById(R.id.txtAge);
        phrase = findViewById(R.id.textTest);
        ville = findViewById(R.id.spinnerVille);

        btnEnregistrer= findViewById(R.id.btnEnregistrer);
/*
        btnEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phrase.setText("Vous appelez "+nom.getText().toString()+" "+prenom.getText().toString()+" Vous avez "+age.getText().toString()+" ans. Vous habitez à"+ville.getSelectedItem().toString()+".");
                phrase.setTextColor(getResources().getColor(R.color.black));
                Toast.makeText(MainActivity.this,"Le texte a été bien affiché",Toast.LENGTH_LONG).show(); //Ne fonctionne pas !!! Pour une raison X
            }
        });*/

        /*Intent it = new Intent(this,welcomeActivity.class);

        btnEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(it);
            }
        });*/


       /*btnEnregistrer.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this,"Je suis la",Toast.LENGTH_LONG).show();
           }
       });*/


     /*   textTest2 = findViewById(R.id.labelTextNom);

        textTest = findViewById(R.id.textTest);
        textTest.setText(textTest2.getText());
        textTest.setTextSize(20);
       // textTest.setText("Je suis le nouveau text");
        textTest.setTextColor(getResources().getColor(R.color.colorTextViewTest));
*/


     /*   textReccupere = findViewById(R.id.textViewTest) ;
        textReccupere.setText("Bonjour Mohammed :)");
        textReccupere.setTextColor(getResources().getColor(R.color.colorTextViewTest));
        textReccupere.setTextSize(getResources().getDimension(R.dimen.SizeTextViewTest));
*/


        /* Test Emulateur
        TextView text = new TextView(this);
        text.setText("Test 1: Emulateur OK!");
        text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        text.setTextSize(22);
        setContentView(text);*/
    }

  /*  public void afficher(View view) {
        Toast.makeText(MainActivity.this,"Je suis la",Toast.LENGTH_LONG).show();
    }*/
}