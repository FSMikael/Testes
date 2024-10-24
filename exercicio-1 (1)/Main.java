import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 20) {
            System.out.println("A metade do número é: " + (numero / 2.0));
        }
    }
}