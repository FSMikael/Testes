import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int pessoasSemObesidade = 0;

        do {
            System.out.println("Digite a altura da pessoa " + (contador + 1) + " em metros:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso da pessoa " + (contador + 1) + " em quilogramas:");
            double peso = scanner.nextDouble();

            double imc = peso / (altura * altura);
            System.out.println("O IMC da pessoa " + (contador + 1) + " é: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                pessoasSemObesidade++;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Número de pessoas com IMC entre 18,5 e 24,9: " + pessoasSemObesidade);
        scanner.close();
    }
}