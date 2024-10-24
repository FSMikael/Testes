import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três números inteiros
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Verificação se os números são iguais
        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais");
        } else {
            // Encontrar o maior número
            int maior = num1;
            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }
            System.out.println("O maior número é: " + maior);
        }

        scanner.close();
    }
}