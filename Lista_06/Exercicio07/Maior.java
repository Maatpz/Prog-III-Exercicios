package lista06;
import java.util.Scanner;

/*7. Faça um programa que leia vários números inteiros e ao final
escreva o maior.*/

public class Maior {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int maior=0;
		System.out.print("Quantidade de numeros: ");
		int qtdNumeros = sc.nextInt();
		
		for(int i=1;i<=qtdNumeros;i++) {
			System.out.print("numero" +i+ ":");
			int numero = sc.nextInt();
			
			if(numero>maior) {
				maior=numero;
			}
		}
		System.out.println("Maior numero: " + maior);
		sc.close();
	}
}
