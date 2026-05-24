package exemplos;

import java.util.Scanner;

public class exemplo010 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        char x;
        x = sc.next() .charAt(0);
        System.out.println("Você digitou o caractere: " + x);

        sc.close();
    }
}
