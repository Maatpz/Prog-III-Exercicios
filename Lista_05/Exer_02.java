package lista05;
import java.util.Scanner;

/*
2. Crie um programa para solicitar o ano atual e o ano de
nascimento de uma pessoa. Calcular sua idade aproximada e
informá-la. Se sua idade for inferior a 16 anos, escrever a
mensagem "Não pode votar"; caso contrário, emitir a mensagem
"É eleitor".
*/

public class exer01 {
	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);
		       
		       System.out.print("Ano atual: ");
		       int anoAtual = scanner.nextInt();
		       
		       System.out.print("Ano de nascimento: ");
		       int anoNasc = scanner.nextInt();
		       
		       int idade = anoAtual - anoNasc;
		     		     
		       System.out.println("Sua idade é: " + idade + " anos.");
		      
		       if (idade<16) {
		    	   System.out.println("Não pode votar. ");
		       }else {
		    	   System.out.println("È eleitor");
		       }
		       scanner.close();
			}
	}
