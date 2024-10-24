import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da idade do nadador
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        // Determinação da categoria
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: infantilA");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: infantilB");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: juvenilA");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: juvenilB");
        } else if (idade >= 18) {
            System.out.println("Categoria: sênior");
        } else {
            System.out.println("Idade fora das categorias definidas.");
        }

        scanner.close();
    }
}