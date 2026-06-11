import java.util.Locale;
import java.util.Scanner;

public class pedido_de_pecas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Código da peça 1: ");
        int codigo_1 = sc.nextInt();
        System.out.print("Número de peças: ");
        int nPecas1 = sc.nextInt();
        System.out.print("Valor unitário da peça: ");
        double valorU1 = sc.nextDouble();

        System.out.print("Código da peça 2: ");
        int codigo_2 = sc.nextInt();
        System.out.print("Número de peças: ");
        int nPecas2 = sc.nextInt();
        System.out.print("Valor unitário da peça: ");
        double valorU2 = sc.nextDouble();

        double valorPagar = ((nPecas1 * valorU1) + (nPecas2 * valorU2));

        System.out.println();
        System.out.println("Código da peça 1: " + codigo_1);
        System.out.println("Número de peças 1: " + nPecas1);
        System.out.printf("Valor unitário de cada peça 1: %.2f%n", valorU1);
        System.out.println();
        System.out.println("Código da peça 2: " + codigo_2);
        System.out.println("Número de peças 2: " + nPecas2);
        System.out.printf("Valor unitário de cada peça 1: %.2f%n", valorU2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

        sc.close();
    }
}
