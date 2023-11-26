package br.com.alura.buscacep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Bem vindo ao busca cep");
        System.out.println("Digite o cep desejado");
        String numeroCep = sc.next();


        try {
            while (!numeroCep.equalsIgnoreCase("sair")) {
                BuscaCep buscaCep1 = new BuscaCep();
                Endereco novoEndereco = buscaCep1.buscaEndereco(numeroCep);
                System.out.println(novoEndereco);
                System.out.println("Para continuar digite um novo cep, se nao digite sair");
                numeroCep = sc.next();
                GeradorDeArquivo gerarArquivo = new GeradorDeArquivo();
                gerarArquivo.geraArquivoJson(novoEndereco);


            }
            System.out.println("Programa finalizado com sucesso \n" +
                    "****************************");
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }
    }
}
