package br.com.alura.screenmatch.principal;

import br.com.alura.musicas.Audio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme filme1 = new Filme("Poderoso chefão", 1970);
        filme1.avalia(8);
        Filme filme2 = new Filme("The Matrix", 1999);
        filme2.avalia(7);
        Filme filme3 = new Filme("Club da Luta", 2004);
        filme3.avalia(10);
        Serie serie1 = new Serie("Lost", 2000);
        serie1.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item : lista) {
            System.out.println("Nome " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2 ){
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println();
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Luiz");
        buscarPorArtista.add("Raquel");
        buscarPorArtista.add("Felipe");
        Collections.sort(buscarPorArtista);
        System.out.println("lista ordenada por nome dos artistas: "+buscarPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de filme por ordem alfabetica: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano de lançamento: " + lista);
    }
}