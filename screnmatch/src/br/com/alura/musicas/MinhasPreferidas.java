package br.com.alura.musicas;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é um sucesso garantido.");
        } else {
            System.out.println(audio.getTitulo() + " é uma opcao a ser pensada.");
        }
    }
}
