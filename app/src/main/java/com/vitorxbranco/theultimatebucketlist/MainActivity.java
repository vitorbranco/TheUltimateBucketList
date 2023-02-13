package com.vitorxbranco.theultimatebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListener();

    }

    private void setupClickListener() {

        CardView cardCoisas = findViewById(R.id.card_view_coisas);
        CardView cardLugares = findViewById(R.id.card_view_lugares);

        cardCoisas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent coisasActivityIntent = new Intent(MainActivity.this, CoisasActivity.class);
                startActivity(coisasActivityIntent);

            }
        });

        cardLugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent coisasActivityIntent = new Intent(MainActivity.this, LugaresActivity.class);
                startActivity(coisasActivityIntent);

            }
        });
    }
}