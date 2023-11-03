package exerciciosSurgeridos;

public class Titulo {
    private String titulo;
    private int anoDePublicacao;
    private int quatidadesDePaginas;

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

    public int getQuatidadesDePaginas() {
        return quatidadesDePaginas;
    }

    public void setQuatidadesDePaginas(int quatidadesDePaginas) {
        this.quatidadesDePaginas = quatidadesDePaginas;
    }

    public void exiberDetalhes(){
        System.out.println("Nome do livro: " + titulo);
        System.out.println("Ano de publicação " + anoDePublicacao);
        System.out.println("A quantidades de paginas é: " + quatidadesDePaginas);
    }
}
