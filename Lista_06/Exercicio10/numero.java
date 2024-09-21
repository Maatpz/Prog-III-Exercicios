package E10;
import java.util.Scanner;

/*10.Elabore um programa que leia diversos números e ao final
escreva: a quantidade de números digitados, a quantidade de
números pares, a quantidade de números ímpares.
*/

public class Numeros {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int totalNumeros = 0;
	        int totalPares = 0;
	        int totalImpares = 0;
	

	        System.out.print("Digite quantidade de números inteiros:");
	        int quantidade = sc.nextInt();
	        
	       for(int i=1;i<=quantidade;i++) {
	    	   System.out.println("Digite o número " + i + ":");
	           int numero = sc.nextInt();
	           
	            if (numero == 0) {
	                break; 
	            }
	            totalNumeros++;
	            
	            if (numero % 2 == 0) {
	                totalPares++; 
	            } else {
	                totalImpares++;
	            }
	        }
	        System.out.println("Quantidade total de números digitados: " + totalNumeros);
	        System.out.println("Quantidade de números pares: " + totalPares);
	        System.out.println("Quantidade de números ímpares: " + totalImpares);

	        sc.close();
	  }
}

