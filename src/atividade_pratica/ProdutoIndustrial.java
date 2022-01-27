package atividade_pratica;

public class ProdutoIndustrial extends Produto {
	String tipoIndustria;
	String descricao;

	public ProdutoIndustrial(String nome, int quantidade, boolean disponibilidade, double preco, String descricao,
			String tipoIndustria) {
		super(nome, quantidade, disponibilidade, preco);
		this.tipoIndustria = tipoIndustria;
		this.descricao = descricao;
	}

	public String getTipoDescricao() {
		return this.tipoIndustria;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void str() {
		System.out.println("ID: " + ProdutoIndustrial.id + " Nome: " + this.nome + " Quantidade: " + this.quantidade
				+ " Disponibilidade: " + this.disponibilidade + " Preço: " + this.preco + " Tipo de Industria: "
				+ this.tipoIndustria + " Descrição: " + this.descricao);
	}

	public static void informarClasse() {
		System.out.println("Este objeto pertence à classe ProdutoIndustrial");
	}
}
