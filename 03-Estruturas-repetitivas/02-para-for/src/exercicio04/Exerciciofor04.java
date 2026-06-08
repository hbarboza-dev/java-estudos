package exercicio04;

import java.util.Scanner;

public class Exerciciofor04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
           double divisao = (double) n1 / n2;
            if (n2 != 0){
                System.out.println(divisao);
            } else {
                System.out.println("divisao impossivel");
            }
        }

        sc.close();
    }
}
