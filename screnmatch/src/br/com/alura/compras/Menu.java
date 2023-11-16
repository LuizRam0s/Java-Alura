package br.com.alura.compras;

import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o limite do cartao: ");
    double limite = sc.nextDouble();
    CartaoDeCretido cartao = new CartaoDeCretido(limite);

    int sair = 1;
    while(sair != 0){
        System.out.println("Digite a descricao da compra: ");
        String descricao = sc.next();

        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        Compra compra = new Compra(descricao, valor);
        boolean compraRealizada = cartao.lancaCompra(compra);

        if (compraRealizada){
            System.out.println("Compra realizada");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            sair = sc.nextInt();
        }else {
            System.out.println("salto insuficiente!");
            sair = 0;
        }
    }

        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n********************");

        System.out.println("\n saldo do cartao: " + cartao.getSaldo());
    }
}
