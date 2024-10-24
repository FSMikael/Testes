
public class Main
{
	public static void main(String[] args) {
	    
	    int contador; //declarando o contador
        contador = 0; //inicializando o contador 
        int resto;
        
        while (contador <= 1000000) {
            resto = contador % 2; // calcula o resto da divisão
            
            if (resto == 0){
                System.out.println("O numero " +  contador + " eh par");
            } else {
                System.out.println("O numero " +  contador + " eh impar");
            }
            contador++;
        }
	}
}
