import java.util.Scanner;

public class Exercício{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[6];

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Digite a " + i + "* nota ");
            notas[1] = entrada.nextDouble();
        }
    System.out.println("Imprimindo os elementos do vetor");
    for (int i = 0; i < 5; i++){
        System.out.println(notas[1]);
    } 
    entrada.close();
    }
}