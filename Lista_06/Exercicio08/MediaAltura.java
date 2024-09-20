package lista06;
import java.util.Scanner;

/*8. Crie um programa que leia o nome e a altura de 10 pessoas e ao
final escreva: a altura média do grupo, o nome e a altura da
pessoa mais alta.*/

public class Media {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	   double soma = 0;
       double mediaAltura = 0;
       double maiorAltura = 0;
       String nomeMaisAlto = "";
		
		
		for(int i=1;i<=2;i++) {
			System.out.print("Nome" +i+ ": ");
			String nome = sc.next();
			
			System.out.print("Altura" +i+ ":");
			double altura = sc.nextDouble();
		
			soma+=altura;
			
			if(altura>maiorAltura) {
				maiorAltura=altura;
				nomeMaisAlto=nome;
			}
		}

		mediaAltura=soma/10.0;
		
		System.out.println("Altura media: " + mediaAltura);
		System.out.println("Nome da pessoa mais alta: " + nomeMaisAlto);
		System.out.println("Pessoa mais alta: " + maiorAltura);
		
		sc.close();
	}
}

