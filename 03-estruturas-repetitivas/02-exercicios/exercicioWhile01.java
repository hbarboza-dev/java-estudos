import java.util.Scanner;

public class exercicioWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
            System.out.println("Senha inválida");
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
