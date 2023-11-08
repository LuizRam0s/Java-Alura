package exerciciosSurgeridos;

public class Livro extends Titulo{
    private String autor;
    private int quatidadesDePaginas;
    private int tempoPaginaLida;

    public int getQuatidadesDePaginas() {
        return quatidadesDePaginas;
    }

    public void setQuatidadesDePaginas(int quatidadesDePaginas) {
        this.quatidadesDePaginas = quatidadesDePaginas;
    }

    public int getTempoPaginaLida() {
        return tempoPaginaLida;
    }

    public void setTempoPaginaLida(int tempoPaginaLida) {
        this.tempoPaginaLida = tempoPaginaLida;
    }

    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int getTempoDeLeituraMedia(){
        return quatidadesDePaginas * tempoPaginaLida ;
    }
}
