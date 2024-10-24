import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais");
        } else {
            int diferenca = Math.abs(numero1 - numero2);
            System.out.println("A diferença entre o maior e o menor número é: " + diferenca);
        }
    }
}