package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Poderoso chefão");
        filme1.setAnoLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichatecnica();
        filme1.avalia(9);
        filme1.avalia(7);
        filme1.avalia(8);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.obterMediasDasAvaliacoes());

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoLancamento(2000);
        serie1.exibeFichatecnica();
        serie1.setTemporadas(10);
        serie1.setEpisodiosPortemporadas(15);
    }
}
