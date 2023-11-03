package exerciciosSurgeridos;

public class PrincipalLivros {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Boa noite PunPun");
        livro1.setAnoDePublicacao(2007);
        livro1.setQuatidadesDePaginas(458);
        livro1.exiberDetalhes();
        livro1.setAutor("Inio Asano");
        System.out.println("O nome do autor é: " + livro1.getAutor());
    }
}
