package br.com.alura.screenmatch.modelos;

public class Episodio {
    private int numero;
    private String nome;
    private Serie serie; // referencia para qual serie ele pertence

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
