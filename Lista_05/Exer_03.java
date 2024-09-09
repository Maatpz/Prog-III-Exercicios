package lista05;
import java.util.Scanner;

/*
3. Faça um programa para solicitar o nome e as duas notas e um
aluno. Calcular sua média e informá-la. Se ela for inferior a
7, escrever "Reprovado”; caso contrário escrever "Aprovado".
*/

public class exer03 {

	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);
		       
		       System.out.print("Nome: ");
		       String nome = scanner.nextLine();
		       
		       System.out.print("Primeira nota : ");
		       int nota1 = scanner.nextInt();
		       
		       System.out.print("segunda nota : ");
		       int nota2 = scanner.nextInt();
		       
		       int media = (nota1 + nota2)/2;
		     		     
		       System.out.println("Seu nome é: " + nome + " sua media e " + media);
		      
		       if (media<7) {
		    	   System.out.println("Reprovado. ");
		       }else {
		    	   System.out.println("Aprovado");
		       }
		       scanner.close();
			}
	}
