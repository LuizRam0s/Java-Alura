package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoexception extends RuntimeException{

    private String mensagem;
    public ErroDeConversaoDeAnoexception(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
