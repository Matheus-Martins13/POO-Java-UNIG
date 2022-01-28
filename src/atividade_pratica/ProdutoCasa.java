package atividade_pratica;

// Herança
public class ProdutoCasa extends Produto {
	String cor;
	String material;

	public ProdutoCasa(String nome, int quantidade, boolean disponibilidade, double preco, String cor,
			String material) {
		super(nome, quantidade, disponibilidade, preco);
		this.cor = cor;
		this.material = material;
	}

	public String getCor() {
		return this.cor;
	}

	public String getMaterial() {
		return this.material;
	}
	
	// Sobrecarga
	public void calcularDesconto(int tipoDesconto, double percentual) {
		if (tipoDesconto == 1) {
			this.preco = this.preco + (this.preco * (percentual / 100));
		} else if (tipoDesconto == 2) {
			this.preco = this.preco - (this.preco * (percentual / 100));
		} else {
			System.out.println("Tipo de desconto inválido!");
		}
	}

	public void str() {
		System.out.println("ID: " + ProdutoCasa.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade
				+ " Disponibilidade: " + this.disponibilidade + " Preço: " + this.preco + " Cor: " + this.cor
				+ " Material: " + this.material);
	}
	// Polimorfismo
	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoCasa");
	}

}
