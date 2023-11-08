package exerciciosSurgeridos;

public class Titulo {
    private String titulo;
    private int anoDePublicacao;
    private int tempoDeLeituraMedia;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getTempoDeLeituraMedia() {
        return tempoDeLeituraMedia;
    }

    public void setTempoDeLeituraMedia(int tempoDeLeituraMedia) {
        this.tempoDeLeituraMedia = tempoDeLeituraMedia;
    }

    public void exiberDetalhes(){
        System.out.println("Nome do livro: " + titulo);
        System.out.println("Ano de publicação " + anoDePublicacao);
    }
}
