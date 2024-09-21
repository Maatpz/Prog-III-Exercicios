import java.util.Scanner;

public class DecaimentoRadioativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a massa inicial do material (em gramas): ");
        double massa = sc.nextDouble();

        int tempo = 0;  

        
        while (massa >= 0.5) {
            massa /= 2;  
            tempo += 50; /
        }

        System.out.printf("Massa final: %.4f gramas%n", massa);
        System.out.println("Tempo necessário: " + tempo + " segundos");

        sc.close();
    }
}
