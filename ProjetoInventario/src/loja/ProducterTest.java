package loja;
import loja.Produto;

public class ProducterTest {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
        Produto produto2 = new Produto();


        produto1.setNomeProduto("");
        produto1.setPreco(2499.0);
        produto1.setUnidadesEmEstoque(15);
        produto1.setNumeroDoItem(1001);

        produto2.setNomeProduto("Fone de Ouvido Bluetooth");
        produto2.setPreco(199.90);
        produto2.setUnidadesEmEstoque(50);
        produto2.setNumeroDoItem(1002);
        

        Produto produto3 = new Produto("Notebook Pro 15", 5799.00, 8, 1003);
        Produto produto4 = new Produto("Tablet 10.1\"", 1299.00, 20, 1004);
        Produto produto5 = new Produto("Smartwatch Fit X", 899.90, 35, 1005);
        Produto produto6 = new Produto("Câmera Digital 4K", 3199.00, 5, 1006);
        
        
        System.out.println(produto1);
        System.out.println();
        System.out.println(produto2);
        System.out.println();
        System.out.println(produto3);
        System.out.println();
        System.out.println(produto4);
        System.out.println();
        System.out.println(produto5);
        System.out.println();
        System.out.println(produto6);
		
	}

}
