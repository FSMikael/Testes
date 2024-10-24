import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numer = new Scanner(System.in);
        
        double numero;
        double metade;
        
        System.out.println("*****Digite um número*****");
        numero = numer.nextDouble();
        
        while (numero > 0) {
            metade = numero / 2;
            System.out.println("A metade de " + numero + " é = " + metade);
            
      
            System.out.println("Digite outro número (ou um número negativo para sair):");
            numero = numer.nextDouble();
        }
        
        numer.close();
    }
}
