package atividade_pratica;

public class ProdutoEsportivo extends Produto {
	String esporte;
	String marca;
	String material;

	public ProdutoEsportivo(String nome, int quantidade, boolean disponibilidade, double preco, String esporte,
			String material, String marca) {
		super(nome, quantidade, disponibilidade, preco);
		this.esporte = esporte;
		this.material = material;
		this.marca = marca;
	}

	public String getEsporte() {
		return this.esporte;
	}

	public String marca() {
		return this.marca;
	}

	public String material() {
		return this.material;
	}

	public void str() {
		System.out.println("ID: " + ProdutoEsportivo.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade
				+ " Disponibilidade: " + this.disponibilidade + " Preço: " + this.preco + " Esporte: " + this.esporte
				+ " Material: " + this.material + " Marca: " + this.marca);
	}

	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoEsportivo");
	}
}
