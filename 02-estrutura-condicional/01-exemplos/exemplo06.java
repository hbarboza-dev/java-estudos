public class exemplo06 {

    public static void main(String[] args) {

        double preco = 34.5;
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

    }
}
