import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= numero; i *= 2) {
            System.out.print(i + " ");
        }
    }
}