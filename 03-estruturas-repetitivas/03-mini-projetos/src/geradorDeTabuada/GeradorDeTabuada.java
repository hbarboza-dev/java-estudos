package geradorDeTabuada;

import java.util.Scanner;

public class GeradorDeTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mult = x * i;
            System.out.println(x + " x " + i + " = " + mult);
        }

        /// Vamos dificultar agora


        System.out.print("Digite um número para gerar a tabuada: ");
        int n = sc.nextInt();
        System.out.print("Digite o início da tabuada: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o fim da tabuada: ");
        int fim = sc.nextInt();
        while (inicio > fim) {
            System.out.println("Intervalo inválido");
            System.out.print("Digite o fim da tabuada: ");
            fim = sc.nextInt();
        }
        for (int i = inicio; i <= fim; i ++ ) {
            int mult = n * i;
            System.out.println(n + " x " + i + " = " + mult);
        }

        sc.close();
    }
}
