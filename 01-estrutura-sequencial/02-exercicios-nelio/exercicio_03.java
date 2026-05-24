// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        int A = sc.nextInt();
        System.out.print("Digite um valor: ");
        int B = sc.nextInt();
        System.out.print("Digite um valor: ");
        int C = sc.nextInt();
        System.out.print("Digite um valor: ");
        int D = sc.nextInt();
        int diferenca = ((A * B) - (C * D));

        System.out.println("Entrada: ");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println("DIFERENÇA = " + diferenca);

        sc.close();
    }
}
