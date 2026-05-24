import java.util.Locale;
import java.util.Scanner;

public class cadastro_pessoa {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        String x;
        int y;
        double z;

        System.out.print("Digite seu nome: ");
        x = sc.next();
        System.out.print("Digite sua idade: ");
        y = sc.nextInt();
        System.out.print("Digite sua altura: ");
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println("Nome: " + x);
        System.out.println("Idade: " + y);
        System.out.printf("Altura: %.2f", z);

        sc.close();
    }
}
