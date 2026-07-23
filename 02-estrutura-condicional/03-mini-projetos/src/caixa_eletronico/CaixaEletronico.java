package caixa_eletronico;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float saldo = 1000.00F;

        System.out.println("===== CAIXA ELETRÔNICO ====");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.println();
        System.out.println("Escolha uma opção:");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.printf("Saldo atual: R$%.2f%n",saldo);
                break;
            case 2:
                System.out.print("Digite o valor do depósito: ");
                float deposito = sc.nextFloat();
                if (deposito > 0) {
                    System.out.println("Depósito realizado com sucesso.");
                    saldo  += deposito;
                    System.out.printf("Novo saldo: R$%.2f%n" ,saldo);
                } else {
                    System.out.println("Déposito inválido.");
                }
                break;
            case 3:
                System.out.print("Digite o valor do saque: ");
                float saque = sc.nextFloat();
                if (saldo >= saque) {
                    System.out.println("Saque realizado com sucesso.");
                    saldo -= saque;
                    System.out.printf("Novo saldo: R$%.2f%n" ,saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                break;
            case 4:
                System.out.println("Encerrando sistema.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
