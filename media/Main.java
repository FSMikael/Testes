import java.util.Scanner;

class Main {
    
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.printf("== Programa média ==\n\n");
    
    System.out.println("Informe o nome do aluno");
    String aluno = ler.nextLine();
    
    System.out.println("Informe a primeira nota:");
    double nota1 = ler.nextDouble();
    
    System.out.println("Informe a segunda nota:");
    double nota2 = ler.nextDouble();
    
    System.out.println("Informe a terceira nota:");
    double nota3 = ler.nextDouble();
    
    double media = (nota1 + nota2 + nota3) / 3;
    
    System.out.printf("A média do aluno %s é %.1f\n", aluno, media);
        
  }
}