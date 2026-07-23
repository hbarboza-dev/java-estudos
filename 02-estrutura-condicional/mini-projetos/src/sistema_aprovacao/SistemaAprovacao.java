package sistema_aprovacao;

import java.util.Locale;
import java.util.Scanner;

public class SistemaAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Nota 1: ");
        float nota = sc.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = sc.nextFloat();
        float media = (nota + nota2) / 2;

        if (nota < 0 || nota > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Nota invalida");
        } else if (media >= 7) {
            System.out.println("Média: " + media);
            System.out.println("Situação: Aprovado");
            if (media >= 9) {
                System.out.println("Parabéns! Excelente desempenho.");
            }
        } else if (media >= 5) {
            System.out.println("Media: " + media);
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Media: " + media);
            System.out.println("Situação: Reprovado");
        }

        sc.close();
    }
}
