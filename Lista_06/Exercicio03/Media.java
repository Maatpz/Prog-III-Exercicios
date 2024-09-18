package lista06;
import java.util.Scanner;

//3. Faça um programa que leia a idade de 10 pessoas. Ao final
//escreva a média das idades.

public class Media {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma=0;
		double media=0;
        
		for(int i=1; i<=3;i++) {
			System.out.print("idade "  +  i + ":");
			int idade = sc.nextInt();
			soma+=idade;
		}
		media=soma/3;
		System.out.print("Media e : " + media);
	}
}
