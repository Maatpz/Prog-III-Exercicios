package lista05;
import java.util.Scanner;

/*
6. Crie um programa para ler o valor do salário-mínimo, o nome e
o salário bruto de um empregado. Se o seu salário for menor
que um salário-mínimo descontar 2%; se for igual, descontar
5%, e se for superior, descontar 8%. Informar o valor do
desconto e o salário líquido.
*/

public class exer06 {

	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);
		       
		        System.out.print("Salário-mínimo: ");
		        double salarioMinimo = scanner.nextDouble();
		        
		        System.out.print("Nome: ");
		        String nome = scanner.next();
		        
		        System.out.print("salário bruto do empregado: ");
		        double salarioBruto = scanner.nextDouble();
		        
		        double desconto = 0.0;
		        double salarioLiquido = 0.0;
		        
		       
		        if (salarioBruto < salarioMinimo) {
		            desconto = salarioBruto * 0.02; 
		        } else if (salarioBruto == salarioMinimo) {
		            desconto = salarioBruto * 0.05; 
		        } else {
		            desconto = salarioBruto * 0.08; 
		        }
		        		       
		        salarioLiquido = salarioBruto - desconto;
		        
		        System.out.println("\nNome do empregado: " + nome);
		        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
		        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
		        
		        scanner.close();
			}
	}
