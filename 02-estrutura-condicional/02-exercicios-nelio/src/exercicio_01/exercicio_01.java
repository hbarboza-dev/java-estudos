package exercicio_01;

import java.util.Scanner;

public class exercicio_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero >= 0){
            System.out.println("NÃO NEGATIVO");
        }
        else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
