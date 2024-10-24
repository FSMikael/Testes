import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
                System.out.printf("== Programa do Dobro ==\n\n ");

        
        System.out.println("Olá, poderia informar um número: ");
            float num = ler.nextFloat();

        
                float dobro = num * 2;

        
        System.out.println("Você digitou o número " + num);
        System.out.println("O dobro é");
        System.out.println(num * 2);
        
        
        
        
    }
}