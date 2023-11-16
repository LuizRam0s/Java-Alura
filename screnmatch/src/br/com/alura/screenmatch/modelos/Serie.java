package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;


public class Serie extends Titulo  {
    private int temporadas;
    private int episodiosPortemporadas;
    private boolean ativa;
    private int minutosPorEpisodios;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPortemporadas() {
        return episodiosPortemporadas;
    }

    public void setEpisodiosPortemporadas(int episodiosPortemporadas) {
        this.episodiosPortemporadas = episodiosPortemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoLancamento() + ") \n";
    }
}
