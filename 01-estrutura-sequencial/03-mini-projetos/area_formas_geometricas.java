import java.util.Locale;
import java.util.Scanner;

public class area_formas_geometricas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = sc.nextDouble();

        double areaTringuloRetangulo = ((A * C) / 2);

        double pi = 3.14159;
        double areaCirculo = (pi * Math.pow(C, 2));

        double areaTrapezio = (((A + B) * C) / 2);

        double areaQuadrado = Math.pow(B,2);

        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n ", areaTringuloRetangulo);
        System.out.printf("CIRCULO: %.3f%n ", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n ", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n ", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n ", areaRetangulo);


        sc.close();
    }
}
