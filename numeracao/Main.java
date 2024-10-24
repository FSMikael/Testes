public class Exemplo2 {
    public static void main(String[] args) {

        int maior = 0;
        int[] numeros = new int[] {90, 234, 567, 34, 6, 888, 988, 100000};

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior) {
                maior = numeros[i];


            }
        }
        System.out.println("O maior número é: " + maior);
    }
    
}