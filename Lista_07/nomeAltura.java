import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();
        
        for (int i = 0; i < 50; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = sc.nextDouble();
            sc.nextLine();

            nomes.add(nome);  
            alturas.add(altura); 
        }
        
        System.out.println("\nPessoas com mais de 1,70 metros:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i));
            }
        }

        sc.close();
    }
}
