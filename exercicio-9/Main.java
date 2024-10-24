import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o código do produto:");
            int codigo = scanner.nextInt();
            System.out.println("Digite a quantidade desejada:");
            int quantidade = scanner.nextInt();

            double preco = 0;
            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            total += preco * quantidade;
            System.out.println("Deseja continuar comprando? (s/n)");
            continuar = scanner.next().equalsIgnoreCase("s");
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", total);
        scanner.close();
    }
}