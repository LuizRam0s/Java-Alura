package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >=4){
            System.out.println("Esta entre os preferidos do momentos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        }else {
            System.out.println("Assistir depois");
        }
    }
}
