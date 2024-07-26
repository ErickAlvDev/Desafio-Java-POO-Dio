package com.ErickAlvDev.desafioIphone.model;

public class Musica {
    private String autor;
    private String nome;
    private String album;
    private int duracao;

    public Musica(String autor, String nome, String album, int duracao) {
        this.autor = autor;
        this.nome = nome;
        this.album = album;
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
