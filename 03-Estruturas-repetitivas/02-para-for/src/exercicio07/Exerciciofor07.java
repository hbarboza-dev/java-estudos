package exercicio07;

import java.util.Scanner;

public class Exerciciofor07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            int quadrado = i * i;
            System.out.print(quadrado + " ");
            int cubo = i * i * i;
            System.out.print(cubo + " ");
            System.out.println();
        }

        sc.close();
    }
}
