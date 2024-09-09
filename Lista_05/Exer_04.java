package lista05;
import java.util.Scanner;

/*
4. Elabore um programa para solicitar o nome, o sexo e o salário
bruto de um empregado. Se o seu sexo for masculino, descontar
5% de seu salário; caso contrário, descontar 3%. Informar o
valor do desconto e o salário líquido.
*/

public class exer04 {

	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);
		       
		       System.out.print("Nome: ");
		       String nome = scanner.nextLine();
		       
		       System.out.print("Sexo: ");
		       char sexo = scanner.next().charAt(0);
		       		       
		       System.out.print("Salario bruto : ");
		       double salario = scanner.nextDouble();	
		       
		       double desconto = 0; 
		      
		       if (sexo == 'M' || sexo == 'm') {
		          desconto = salario * 0.05; 
		       } else if (sexo == 'F' || sexo == 'f') {
		            desconto = salario * 0.03;
		        } else {
		            System.out.println("Sexo inválido!");		      
		        }
		       
		       double salarioLiquido = salario-desconto;
		       	System.out.println("\nEmpregado: " + nome);
		        System.out.println("Desconto aplicado: R$ " + desconto);
		        System.out.println("Salário líquido: R$ " + salarioLiquido);
		        
		        scanner.close();
			}
	}
