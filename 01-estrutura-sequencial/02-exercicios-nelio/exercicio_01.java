// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class exercicio_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.println("Entrada");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Saída:");
        System.out.println("SOMA = " + soma);


        sc.close();
    }
}
