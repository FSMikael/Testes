import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do salário
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        // Cálculo do desconto do INSS
        double desconto;
        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        // Impressão do desconto
        System.out.println("Desconto do INSS: R$ " + desconto);

        scanner.close();
    }
}