package br.com.alura.musicas;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas = 0;
    private int classificacao;


    public Audio(String titulo, double duracao, int classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir(){
        this.curtidas ++;
    }

    public void reproduzir(){
        this.totalDeReproducoes ++;
    }
}
