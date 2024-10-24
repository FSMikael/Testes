import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double nota;

        do{

            System.out.println("****Digite uma nota ****");
            nota = entrada.nextDouble();

        }while (nota < 0 || nota> 10) ;
        
        System.out.println("nota correta");

        entrada.close();


    }
}
