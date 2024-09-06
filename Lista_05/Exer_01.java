package lista05;
import java.util.Scanner;

/*
1. Faça um programa para solicitar o nome e a idade de uma pessoa.
Se sua idade for menor que 18 anos, escrever a mensagem: "É
menor".
*/

public class exer01 {

	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);
		       
		       System.out.print("Nome: ");
		       String nome = scanner.nextLine();
		       
		       System.out.print("Idade: ");
		       int idade = scanner.nextInt();
		      
		       if (idade<18) {
		    	   System.out.println(nome + ", você é menor de idade");
		       }else {
		    	   System.out.println(nome + ", você é maior de idade");
		       }
		       scanner.close();
			}
	}
