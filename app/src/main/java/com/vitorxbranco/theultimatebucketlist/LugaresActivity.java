package com.vitorxbranco.theultimatebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LugaresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        setupList();
    }

    private void setupList() {
        RecyclerView listaCoisas = findViewById(R.id.recycler_view_lugares);

        CoisasLugares[] coisas = {
                new CoisasLugares("Machu Picchu, Peru", "Conhecer as ruínas da civilização inca.",R.drawable.machupicchu_small, 5),
                new CoisasLugares("Tóquio, Japão", "Conhecer a cultura, gastronomia e tecnologia da cidade.", R.drawable.tokyo, 4.5f),
                new CoisasLugares("Praga, República Checa", "Visitar os monumentos e conhecer a vida noturna.", R.drawable.praga, 5),
                new CoisasLugares("Auckland, Nova Zelândia", "Aproveitar e conhecer o condado dos Hobbits!", R.drawable.auckland, 4.2f),
                new CoisasLugares("Dublin, Irlanda", "Conhecer os famosos pubs e experimentar cervejas irlandesas.",R.drawable.dublin, 4.5f),
                new CoisasLugares("Orlando, Estados Unidos", "Conhecer a Disney World Orlando.",R.drawable.orlando, 4.8f),
                new CoisasLugares("Cairo, Egito", "Ver as famosas pirâmides do Egito.",R.drawable.cairo, 4.2f),
                new CoisasLugares("Deserto do Atacama, Chile", "Conhecer as salinas e gêisers do deserto mais seco do mundo.",R.drawable.atacama,4.4f)
        };

        CoisasLugaresAdapter adapter = new CoisasLugaresAdapter(coisas);

        listaCoisas.setAdapter(adapter);
    }
}