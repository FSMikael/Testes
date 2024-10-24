 import java.util.Scanner;
 
 class Main {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
         System.out.printf("== Programa da Metade ==\n\n");
         
         System.out.printf("Informe um número:\n");
         int num = ler.nextInt();
         int metade = num / 2;
         
                  System.out.println("A metade é ");
                           System.out.println(metade);

     }
 }