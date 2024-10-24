import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do salário bruto
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        // Leitura do valor da prestação
        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        // Cálculo do valor máximo da prestação permitida
        double valorMaximoPrestacao = salarioBruto * 0.30;

        // Verificação se o empréstimo pode ser concedido
        if (valorPrestacao <= valorMaximoPrestacao) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        scanner.close();
    }
}