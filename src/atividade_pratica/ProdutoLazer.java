package atividade_pratica;

public class ProdutoLazer extends Produto {
	String tipoLazer;
	String descricaoLazer;

	public ProdutoLazer(String nome, int quantidade, boolean disponibilidade, double preco, String tipoLazer,
			String descricaoLazer) {
		super(nome, quantidade, disponibilidade, preco);
		this.tipoLazer = tipoLazer;
		this.descricaoLazer = descricaoLazer;
	}

	public String getTipoLazer() {
		return this.tipoLazer;
	}

	public String gerDescricaoLazer() {
		return this.descricaoLazer;
	}

	public void str() {
		System.out.println("ID: " + ProdutoLazer.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade
				+ " Disponibilidade: " + this.disponibilidade + " Preço: " + this.preco + " Tipo de Lazer: "
				+ this.tipoLazer + " Descrição Lazer: " + this.descricaoLazer);
	}

	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoLazer");
	}
}
