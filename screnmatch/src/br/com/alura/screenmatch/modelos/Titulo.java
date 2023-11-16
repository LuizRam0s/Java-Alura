package br.com.alura.screenmatch.modelos;

import java.util.Comparator;

public class Titulo implements Comparable<Titulo> {
    //Declaração dos atributos
    private String nome;
    private int anoLancamento;
    private boolean incluidonoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //construtores
    public Titulo(String nome, int anoLancamento){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    //getter para acessar valores
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidonoPlano() {
        return incluidonoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    //setters para mudar valores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidonoPlano(boolean incluidonoPlano) {
        this.incluidonoPlano = incluidonoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Metodos
    public void exibeFichatecnica(){
        System.out.println("Nome do titulo: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double obterMediasDasAvaliacoes(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "br.com.alura.screenmatch.modelos.Filme{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", incluidonoPlano=" + incluidonoPlano +
                ", avaliacao=" + somaDasAvaliacao +
                ", totalDeAvaliacoes=" + totalDeAvaliacoes +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
