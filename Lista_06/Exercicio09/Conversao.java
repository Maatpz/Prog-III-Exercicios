package Exercicio09;

/*
9. A conversão de graus Farenheit para graus centígrados é obtida
por : C = 5/9 * (F -32). Faça um programa que calcule e escreva
uma tabela de centígrados em função de graus Farenheit, que
variam de 100 a 150 de 1 em 1.*/

public class ConversaoTemp {
	public static void main(String[] args) {
		
		System.out.println("Tabela de Conversão:");
        System.out.println("Fahrenheit \t Celsius");
  
        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
            double celsius = 5.0 / 9.0 * (fahrenheit - 32); 
            System.out.printf("%d \t\t %.2f%n", fahrenheit, celsius);

        }

	}
}