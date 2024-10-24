import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            double nota1, nota2;
            
        
            do {
                System.out.println("Digite a primeira nota do aluno " + i + " (entre 0 e 10):");
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida. Tente novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);
            
           
            do {
                System.out.println("Digite a segunda nota do aluno " + i + " (entre 0 e 10):");
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida. Tente novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);
            
          
            double media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno " + i + " é: " + media);
        }
        
        scanner.close();
    }
}