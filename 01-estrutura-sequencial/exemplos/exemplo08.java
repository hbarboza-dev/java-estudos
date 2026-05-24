package exemplos;

import java.util.Scanner;

public class exemplo08 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Você digitou o número: " + x);

        sc.close();
    }
}
