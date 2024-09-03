package controle;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
4. O camelô Zé da banca vende diariamente, games, calculadoras e canetas. Faça
um programa para solicitar o total de games, o total de calculadoras e o
total de canetas vendidas ao término do dia. O programa deve solicitar também
o preço de cada um dos produtos e ao final calcular e informar o total do
faturamento com cada produto e o faturamento total.
*/

public class Exe04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Total games: ");
		int totalGame = sc.nextInt();
		System.out.print("Preço dos games: ");
		double precoGame = sc.nextDouble();
		
		System.out.print("Total calculadoras: ");
		int totalCal=sc.nextInt();
		System.out.print("Preço da calculadora: ");
		double precoCal = sc.nextDouble();
		
		System.out.print("Total canetas: ");
		int totalCaneta = sc.nextInt();
		System.out.print("Preço das canetas: ");
		double precoCaneta = sc.nextDouble();
		
		double faturamentoGames = totalGame*precoGame;
		double faturamentoCal = totalCal * precoCal;
        double faturamentoCanetas = totalCaneta * precoCaneta;
        double faturamentoTotal = faturamentoGames+faturamentoCal+faturamentoCanetas;
        
        System.out.println("Faturamento dos games: "+ df.format(faturamentoGames));
        System.out.println("Faturamento das calculadoras: "+ df.format(faturamentoCal));
        System.out.println("Faturamento das canetas: "+ df.format(faturamentoCanetas));
        System.out.println("Faturamento total: "+ df.format(faturamentoTotal));
        
        sc.close();
	}
}
