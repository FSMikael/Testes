import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int resto;
        int contador = 0;

        System.out.println();
        System.out.println("====Exercício 2====");
        System.out.println("Digite 10 números");
        
        while (contador < 10){ 
            resto = digite.nextInt();
            resto = contador % 2;
            
            if (resto == 0){
                pares++; 
                
            }
            else impares++;
            contador++;
        }
        System.out.println("pares" + pares);
        System.out.println("impares" + impares);
        digite.close();
    }
}
