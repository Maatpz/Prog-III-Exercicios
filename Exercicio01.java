package controle;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
1. Crie um programa para ler a matrícula e o salário de dois empregados. Descontar
5% no salário do primeiro e acrescentar 9% no salário do segundo. Informar: o
valor do desconto do primeiro; o valor do acréscimo do segundo; o salário
final do primeiro; o salário final do segundo.
*/

public class Lista04_Exe01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite a primeira Matricula: ");
		int matricula1=scanner.nextInt();
		System.out.print("Digite o primeiro salário: ");
		double salario1 = scanner.nextDouble();
			
		System.out.print("Digite a segunda Matricula: ");
		int matricula2=scanner.nextInt();
		System.out.print("Digite o segundo salário: ");
		double salario2 = scanner.nextDouble();
		
		double desconto = salario1 * 0.05;
		double acrescimo = salario2 * 0.09;
		double salarioFinal1 = salario1 - desconto;
		double salarioFinal2 = salario2 + acrescimo;
		
		System.out.println("Valor do desconto: " + df.format(desconto));
		System.out.println("Valor do acrescimo: " + df.format(acrescimo));
		System.out.println("Salario Final 1: " + df.format(salarioFinal1));
		System.out.println("Salario Final 2: " + df.format(salarioFinal2));
		
		scanner.close();
	}
}
