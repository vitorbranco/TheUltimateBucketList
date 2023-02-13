package com.vitorxbranco.theultimatebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CoisasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coisas);
        setupList();

    }

    private void setupList() {
        RecyclerView listaCoisasRecyclerView = findViewById(R.id.recycler_view_coisas);

        CoisasLugares[] coisas = {
                new CoisasLugares("Pular de paraquedas", "Pular de paraquedas em um lugar bonito (com instrutor, claro!).", R.drawable.paraquedas, 4.5f),
                new CoisasLugares("Fazer bungee jumping", "Em um lugar bem alto e seguro, de preferência.", R.drawable.bungee, 4),
                new CoisasLugares("Trabalhar em um grande projeto", "Ajudar a desenvolver um projeto grande, que beneficiará milhões de pessoas.",R.drawable.trabalho, 5),
                new CoisasLugares("Ver a aurora boreal", "Apreciar esse espetáculo da natureza!", R.drawable.aurora, 4.5f),
                new CoisasLugares("Fazer um cruzeiro pelo mar mediterrâneo", "Um cruzeiro all inclusive com paradas nas mais belas ilhas do mediterrâneo.",R.drawable.cruzeiro, 4.8f),
                new CoisasLugares("Fazer a trilha Ruy Braga", "Dois dias de trilha, não esquecer de levar o fogareiro rsrs.",R.drawable.trilha, 4.2f),
                new CoisasLugares("Ir no Tomorrowland", "O maior festival de música eletrônica do mundo",R.drawable.tomorrowland, 4),
                new CoisasLugares("Ver o Palmeiras ser campeão mundial", "Será que rola?",R.drawable.palmeiras, 5)
        };

        CoisasLugaresAdapter adapter = new CoisasLugaresAdapter(coisas);

        listaCoisasRecyclerView.setAdapter(adapter);
    }
}