import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos de trabalho do funcionário: ");
        int anosTrabalho = scanner.nextInt();

        double bonus = calcularBonus(salario, anosTrabalho);
        System.out.printf("O valor do bônus é: R$%.2f%n", bonus);
    }

    public static double calcularBonus(double salario, int anosTrabalho) {
        if (anosTrabalho >= 5) {
            return salario * 0.20;
        } else {
            return salario * 0.10;
        }
    }
}