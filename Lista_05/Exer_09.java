package lista05;
import java.util.Scanner;
import java.text.DecimalFormat;


/*9. Dado três valores X,Y,Z, verificar se eles podem ser o
comprimento dos lados de um triângulo e, se forem, verificar
se é um triângulo, equilátero, isósceles ou escaleno. Se eles
não formarem um triângulo, escreverem uma mensagem. Obs: O
comprimento de cada lado de um triângulo é menor do que a soma
dos comprimentos dos outros dois lados; chama-se triângulo
equilátero ao triângulo que tem os comprimentos dos três lados
iguais; chama-se triângulo isósceles ao triângulo que tem os
comprimentos de dois lados iguais. Portanto, todo triângulo
equilátero é também isósceles; chama-se triângulo escaleno ao
triângulo que tem os comprimentos dos três lados diferentes.*/


import java.util.Scanner;
public class TipoTriangulo {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Digite o comprimento do lado X: ");
       double x = scanner.nextDouble();
      
       System.out.print("Digite o comprimento do lado Y: ");
       double y = scanner.nextDouble();
      
       System.out.print("Digite o comprimento do lado Z: ");
       double z = scanner.nextDouble();
    
       if (x + y > z && x + z > y && y + z > x) {
          
           if (x == y && y == z) {
               System.out.println("O triângulo é equilátero.");
           } else if (x == y || x == z || y == z) {
               System.out.println("O triângulo é isósceles.");
           } else {
               System.out.println("O triângulo é escaleno.");
           }
       } else {
           System.out.println("Os valores fornecidos não formam um triângulo.");
       }
       scanner.close();
   }
}
