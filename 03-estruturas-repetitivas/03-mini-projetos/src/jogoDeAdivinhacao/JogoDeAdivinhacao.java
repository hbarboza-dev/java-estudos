package jogoDeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== JOGO DE ADIVINHAÇÃO =====");
        System.out.println();

        int palpite;
        int tentativas = 0;
        System.out.print("Digite o valor mínimo: ");
        int min = sc.nextInt();
        System.out.println();
        System.out.print("Digite o valor máximo: ");
        int max = sc.nextInt();
        while (min > max) {
            System.out.println("Valor inválido");
            System.out.print("O máximo precisa ser maior ou igual ao mínimo.: ");
            max = sc.nextInt();
        }
        System.out.println();
        int numeroSecreto = random.nextInt(max - min + 1) + min;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;
            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
                System.out.println();
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
                System.out.println();
            } else {
                System.out.println("PARABÉNS! Você acertou!");
                System.out.println();
                System.out.println("Número de tentativas: " + tentativas);
            }
        } while (palpite != numeroSecreto);

        sc.close();
    }
}
