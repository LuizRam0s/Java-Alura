package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Poderoso chefão", 1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidonoPlano(true);
        System.out.println("Duração do filme " + filme1.getDuracaoEmMinutos());

        Filme filme2 = new Filme("The Matrix", 1999);
        filme2.setDuracaoEmMinutos(135);
        filme2.setIncluidonoPlano(true);

        Filme filme3 = new Filme("Club da Luta", 2004);
        filme3.setDuracaoEmMinutos(165);
        filme3.setIncluidonoPlano(true);

        filme2.exibeFichatecnica();
        filme2.avalia(9);
        filme2.avalia(7);
        filme2.avalia(8);
        System.out.println("Total de avaliações: " + filme2.getTotalDeAvaliacoes());
        System.out.println(filme2.obterMediasDasAvaliacoes());

        Serie serie1 = new Serie("Lost", 2000);
        serie1.exibeFichatecnica();
        serie1.setTemporadas(10);
        serie1.setEpisodiosPortemporadas(15);
        serie1.setMinutosPorEpisodios(50);
        System.out.println("Duração da serie Lost completa é " + serie1.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Tempo total dos filmes selecionados " + calculadora.getTempoTotal());

        Episodio primeiroEpisodio = new Episodio();
        primeiroEpisodio.setNumero(1);
        primeiroEpisodio.setSerie(serie1);
        primeiroEpisodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(primeiroEpisodio);
        filtro.filtrar(filme1);
        filtro.filtrar(filme2);

        ArrayList<Filme> meusFilmes = new ArrayList<>();
        meusFilmes.add(filme1);
        meusFilmes.add(filme2);
        meusFilmes.add(filme3);

        System.out.println("Total de filmes adicionado na lista é " + meusFilmes.size());
        System.out.println("O primeiro filme é " + meusFilmes.get(0).getNome());
        System.out.println(meusFilmes);
    }
}
