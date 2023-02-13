package com.vitorxbranco.theultimatebucketlist;

import androidx.annotation.DrawableRes;

public class CoisasLugares {

    String titulo;
    String descricao;
    int imagem;
    float nota;

    public CoisasLugares(String titulo, String descricao, @DrawableRes int imagem, float nota) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.nota = nota;
    }
}
