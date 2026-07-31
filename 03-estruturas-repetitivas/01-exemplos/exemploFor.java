import java.util.Scanner;

public class exemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int soma = 0;
        for  (int i = 0; i < n; i++) {
            int n2 = sc.nextInt();
            soma += n2;
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
