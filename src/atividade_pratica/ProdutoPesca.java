package atividade_pratica;

public class ProdutoPesca extends Produto {
	String material;

	public ProdutoPesca(String nome, int quantidade, boolean disponibilidade, double preco, String material) {
		super(nome, quantidade, disponibilidade, preco);
		this.material = material;
	}

	public String getMaterial() {
		return this.material;
	}

	public void str() {
		System.out.println("ID: " + ProdutoPesca.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade
				+ " Disponibilidade: " + this.disponibilidade + " Preço: " + this.preco + " Material: "
				+ this.material);
	}

	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoPesca");
	}
}
