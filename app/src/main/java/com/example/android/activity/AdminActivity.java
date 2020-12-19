package com.example.android.activity;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.android.R;


public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void goToSpisakKorisnika(View view){
        Intent i = new Intent(this, KorisniciActivity.class);
        startActivity(i);
    }


    public void goToSpisakVozila(View view){
        Intent i = new Intent(this, VozilaActivity.class);
        startActivity(i);
    }

    public void goToListaVoznji(View view){
        Intent i = new Intent(this, VoznjaActivity.class);
        startActivity(i);
    }


}
