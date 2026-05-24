// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo_1 = sc.nextInt();
        int nPecas1 = sc.nextInt();
        double valorU1 = sc.nextDouble();

        int codigo_2 = sc.nextInt();
        int nPecas2 = sc.nextInt();
        double valorU2 = sc.nextDouble();

        double valorPagar = ((nPecas1 * valorU1) + (nPecas2 * valorU2));


        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

        sc.close();
    }
}
