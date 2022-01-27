package atividade_pratica;

public class ProdutoPetShop extends Produto {
	String tipoAnimal;
	String tipoProduto;

	public ProdutoPetShop(String nome, int quantidade, boolean disponibilidade, double preco, String tipoAnimal,
			String tipoProduto) {
		super(nome, quantidade, disponibilidade, preco);
		this.tipoAnimal = tipoAnimal;
		this.tipoProduto = tipoProduto;
	}

	public String getTipoAnimal() {
		return this.tipoAnimal;
	}

	public String getTipoProduto() {
		return this.tipoProduto;
	}

	public void str() {
		System.out.println("ID: " + ProdutoPetShop.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade + " Disponibilidade: "
				+ this.disponibilidade + " Preço: " + this.preco + " Tipo de animal: " + this.tipoAnimal
				+ " Tipo de produto: " + this.tipoProduto);
	}

	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoPetShop");
	}
}
