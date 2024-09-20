package lista06;
import java.util.Scanner;
import java.text.DecimalFormat;

//* */ 6. Elabore um programa que leia a idade de diversas pessoas e ao
// final informe: o total de pessoas cadastradas, a porcentagem
// de pessoas com idade inferior a 18 anos, a porcentagem de
// pessoas com idade igual ou superior a 18 anos.*/

public class Porcentagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double totalPessoas = 0;
        int menoresDeIdade = 0;
        int maioresDeIdade = 0;
        
        System.out.print("Quantidade a cadastrar: ");
        int qtdPessoas = sc.nextInt();

        for (int i = 1; i <= qtdPessoas; i++) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();

            totalPessoas++;
            if (idade < 18) {
                menoresDeIdade++;
            } else {
                maioresDeIdade++;
            }
        }

        double porcentagemMenores = (menoresDeIdade / totalPessoas) * 100;
        double porcentagemMaiores = (maioresDeIdade / totalPessoas) * 100;

        System.out.println("Pessoas cadastradas: " + df.format(totalPessoas));
        System.out.println("Porcentagem de pessoas com idade inferior a 18 anos: " + df.format(porcentagemMenores) + "%");
        System.out.println("Porcentagem de pessoas com idade igual ou superior a 18 anos: " + df.format(porcentagemMaiores) + "%");
        
        sc.close();
    }
}
