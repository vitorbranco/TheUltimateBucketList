package com.vitorxbranco.theultimatebucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoisasLugaresAdapter extends RecyclerView.Adapter<CoisasLugaresAdapter.CoisasLugaresViewHolder> {

    private CoisasLugares[] coisasLugares;

    public CoisasLugaresAdapter(CoisasLugares[] coisasLugares) {
        this.coisasLugares = coisasLugares;
    }

    @Override
    public int getItemCount() {
        return coisasLugares.length;
    }

    @NonNull
    @Override
    public CoisasLugaresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lista_padrao, parent,false);
        return new CoisasLugaresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoisasLugaresViewHolder holder, int position) {
        holder.bind(coisasLugares[position], position);
    }

    static class CoisasLugaresViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImagem;
        private TextView appDescricao;
        private TextView appTitulo;
        private RatingBar appNota;

        public CoisasLugaresViewHolder(@NonNull View itemView) {
            super(itemView);
            appImagem = itemView.findViewById(R.id.image_view_item_imagem);
            appTitulo = itemView.findViewById(R.id.text_view_titulo);
            appDescricao = itemView.findViewById(R.id.text_view_descricao);
            appNota = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(CoisasLugares coisasLugares, int position) {
            String stringTitulo = position + 1 + ". " + coisasLugares.titulo;
            appTitulo.setText(stringTitulo);
            appDescricao.setText(coisasLugares.descricao);
            appImagem.setImageResource(coisasLugares.imagem);
            appNota.setRating(coisasLugares.nota);
        }
    }


}
