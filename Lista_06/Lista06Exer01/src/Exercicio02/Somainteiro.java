package Exercicio02;
import java.util.Scanner;
import java.text.DecimalFormat;

//2. Faça um programa que calcule e escreva no vídeo o somatório
//dos números inteiros de 1 até 50.

public class Somainteiro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int soma = 0;
		
		for(int i = 1; i<=50;i++) {
			soma+=i;
		}
		 System.out.println("A soma dos numeros e: " + soma);
		 scanner.close();
	}
}
