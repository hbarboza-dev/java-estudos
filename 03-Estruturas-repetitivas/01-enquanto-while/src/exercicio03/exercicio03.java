package exercicio03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoDeCombustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoDeCombustivel != 4) {
            if (tipoDeCombustivel == 1){
                alcool += 1;
            } else if (tipoDeCombustivel == 2) {
                gasolina += 1;
            }else if (tipoDeCombustivel == 3){
                diesel += 1;
            }
            tipoDeCombustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
