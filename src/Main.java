import conta.Cartao;
import produtos.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        List<Produto> produtos= new ArrayList<>();
        int opcao;
        double preco;
        String nome;

        System.out.println("    ===================================== ");
        System.out.println("    Olá, Informe o saldo da conta");
        Cartao cartao= new Cartao(read.nextDouble());
        System.out.println("    VOcê possui um limite extra de R$" + cartao.getLimiteCredito());
        System.out.println("    Agora Vamos ao Menu \n    =====================================");

        do{
            System.out.println("    ===================================== ");
            System.out.println("""
                        Menu da conta(escolha uma opcao):
                      1 - Consultar saldo
                      2 - Comprar produto
                      3 - Exibir histórico de compras
                      4 - sair""");
            opcao=read.nextInt();
            System.out.println("    ===================================== ");



            switch(opcao){
                case 1:
                    System.out.println(cartao);
                    break;


                case 2:
                    System.out.println("Qual é nome do produto?");
                    read.nextLine();
                    nome=read.nextLine();
                    System.out.println("Qual é o valor do produto?");
                    preco= read.nextDouble();
                    if(cartao.compraAprovada(cartao.verificarComprar(preco))){
                    Produto produto=new Produto(nome,preco);
                    produtos.add(produto);
                    }
                    break;

                case 3:
                    Collections.sort(produtos);
                    String imprimir;
                    for (Produto p : produtos) {
                        imprimir = p.toString();
                        System.out.println(imprimir);
                    }
                    break;


            }

        }while(opcao!=4);
        Collections.sort(produtos);
        System.out.println("saldo final R$" +cartao.getSaldo()+ " limite de R%" + cartao.getLimiteCredito());
        String imprimir="";
        for (Produto p : produtos){
            imprimir = p.toString();
            System.out.println(imprimir);}

    }


}
