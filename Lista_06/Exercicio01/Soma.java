package Exercicio01;
import java.util.Scanner;
import java.text.DecimalFormat;

//1. Faça um programa que leia o preço de 10 produtos.
//Ao final escreva o somatório dos preços.

public class Soma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
        double somaPrecos = 0.0;
        double preco;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            preco = scanner.nextDouble();
            somaPrecos += preco;
        }     
        System.out.printf("Soma dos preços: R$" + df.format(somaPrecos));
        scanner.close();		
	}
}
