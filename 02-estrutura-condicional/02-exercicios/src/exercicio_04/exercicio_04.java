package exercicio_04;

import java.time.Duration;
import java.util.Scanner;

public class exercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if(horaInicial < horaFinal){
            duracao = horaInicial - horaFinal;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
