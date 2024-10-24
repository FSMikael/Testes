import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número (ponto flutuante): ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número (ponto flutuante): ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("Ordem decrescente: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Ordem decrescente: " + numero2 + ", " + numero1);
        }
    }
}