package atividade_pratica;

public class ProdutoEletronico extends Produto {
	double voltagem;
	double corrente;

	public ProdutoEletronico(String nome, int quantidade, boolean disponibilidade, double preco, double voltagem,
			double corrente) {
		super(nome, quantidade, disponibilidade, preco);
		this.voltagem = voltagem;
		this.corrente = corrente;
	}

	public double getVoltagem() {
		return this.voltagem;
	}

	public double getCorrente() {
		return this.corrente;
	}

	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoEletrônico.");
	}

	public void str() {
		System.out.println("ID: " + ProdutoEletronico.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade
				+ " Disponibilidade: " + this.disponibilidade + " Preço: " + this.preco + " Voltagem: " + this.voltagem
				+ " Corrente: " + this.corrente);
	}

}
