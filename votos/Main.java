import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da idade da pessoa
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        // Verificação da aptidão para votar
        if (idade >= 18) {
            System.out.println("A pessoa está apta a votar.");
        } else if (idade >= 16) {
            System.out.println("A pessoa pode votar, mas não é obrigatório.");
        } else {
            System.out.println("A pessoa não está apta a votar.");
        }

        scanner.close();
    }
}