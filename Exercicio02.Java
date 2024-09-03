package controle;
import java.util.Scanner;
import java.text.DecimalFormat;

// 2. Faça um programa que dado o valor da temperatura em graus FARENHEIT, calcular
// 		e escrever o valor da temperatura em graus CELSIUS.
// 		Fórmula: C = 5/9 * (F - 32)

public class Lista04_Exe02 {

	public static void main(String[] args) {	

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("temperatura em Farenheit: ");
		double farenheit=scanner.nextDouble();

		double celsius = (farenheit-32) * 5 / 9;

		System.out.print("Valor em Celsius : " + df.format(celsius));

        scanner.close();
    }
}

