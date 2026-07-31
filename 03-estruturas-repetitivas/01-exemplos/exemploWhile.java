import java.util.Scanner;

public class exemploWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma += x;
            System.out.println("Digite um número: ");
            x = sc.nextInt();
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
