package loja;


	public class Produto {
		private String nomeProduto;
		private double preco;
		private int unidadesEmEstoque;
		private int numeroDoItem;
		
	public Produto() {
		this.nomeProduto = "Greatest Hits";
		this.preco = 9.99;
	    this.unidadesEmEstoque = 25;
		this.numeroDoItem = 1;
	}
		
	 public Produto(String nomeProduto, double preco, int unidadesEmEstoque, int numeroDoItem) {
	    this.nomeProduto = nomeProduto;
	    this.preco = preco;
	    this.unidadesEmEstoque = unidadesEmEstoque;
	    this.numeroDoItem = numeroDoItem;
	 }

	 
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getUnidadesEmEstoque() {
		return unidadesEmEstoque;
	}

	public void setUnidadesEmEstoque(int unidadesEmEstoque) {
		this.unidadesEmEstoque = unidadesEmEstoque;
	}

	public int getNumeroDoItem() {
		return numeroDoItem;
	}

	public void setNumeroDoItem(int numeroDoItem) {
		this.numeroDoItem = numeroDoItem;
	}
	
	public String toString() {
	    return "Número do Item: " + numeroDoItem + "\n" +
	           "Nome: " + nomeProduto + "\n" +
	           "Quantidade em estoque: " + unidadesEmEstoque + "\n" +
	           "Preço: " + String.format("%.2f", preco);
	}



}
