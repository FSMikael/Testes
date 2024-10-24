import java.util.Scanner;
import java.util.Random;

public class Main {
    
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    Random aleatorio = new Random();
	    
	    
	    System.out.println("Informe um número: ");
	    int numero = ler.nextInt();
	    
	    int sorteado = aleatorio.nextInt(11);
	    
	    	   boolean acertou = numero == sorteado;
	    	   
	    	   System.out.println("Ganhouuuuu?");
	    	   	    	   System.out.println(acertou);
	    	   	    	   
	    	   	 System.out.println("O numero sorteado foi " + sorteado);



	    
	}
}
