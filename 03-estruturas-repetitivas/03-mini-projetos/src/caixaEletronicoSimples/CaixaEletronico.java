package caixaEletronicoSimples;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("===== CAIXA ELETRÔNICO =====");
            System.out.println(" 1 - Consultar saldo ");
            System.out.println(" 2 - Depositar ");
            System.out.println(" 3 - Sacar ");
            System.out.println(" 4 - Sair ");
            System.out.println();
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite qual valor deseja depositar: ");
                    double valor = sc.nextDouble();
                    while (valor <= 0) {
                        System.out.print("Valor inválido! Digite um valor positivo: ");
                        valor = sc.nextDouble();
                    }
                    System.out.println("Valor depositado: " + valor);
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.print("Digite qual valor deseja sacar: ");
                    double saque = sc.nextDouble();
                    while (saque > saldo || saque <= 0) {
                        if (saque > saldo) {
                        System.out.print("Saldo insuficiente! Digite um valor menor ou igual ao saldo atual: ");
                        } else {
                            System.out.print("Valor inválido! Digite um valor positivo: ");
                        }
                        saque = sc.nextDouble();
                    }
                    saldo -= saque;
                    System.out.println("Saque feito com sucesso! Saldo atual: " + saldo);
                    break;
                case 4:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite uma opção válida.");
                    break;
            }
        }

        sc.close();
    }
}
