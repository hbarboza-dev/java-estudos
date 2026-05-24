// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print(" Digite seu número: ");
        int numero = sc.nextInt();
        System.out.print("Agora digite suas horas trabalhadas: ");
        int horas = sc.nextInt();
        System.out.print("Quanto você recebe por hora: ");
        double ValorHora = sc.nextDouble();
        double salario = horas * ValorHora;

        System.out.println("Entrada:");
        System.out.println(numero);
        System.out.println(horas);
        System.out.println(ValorHora);
        System.out.println("Saída:");
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + salario);



        sc.close();
    }
}
