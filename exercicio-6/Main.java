import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int menor = Integer.MAX_VALUE; 
        
        do {
            System.out.println("Digite um número inteiro e positivo:");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                if (numero < menor) {
                    menor = numero;
                }
                contador++;
            } else {
                System.out.println("Por favor, digite um número positivo.");
            }
        } while (contador < 10);
        
        System.out.println("O menor número digitado foi: " + menor);
        scanner.close();
    }
}