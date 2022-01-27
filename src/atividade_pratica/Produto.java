package atividade_pratica;

public abstract class Produto implements Disponibilidade{
	static int id;
	String nome;
	int quantidade;
	double preco;
	boolean disponibilidade;
	
	
	public Produto(String nome, int quantidade, boolean disponibilidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.disponibilidade = disponibilidade;
		this.preco = preco;
		Produto.id = Produto.acrescentaId();
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void mudarDisponibilidade() {
		if (this.disponibilidade) {
			this.disponibilidade = false;
		}
		else {
			this.disponibilidade = true;
		}
	}
	
	public void calcularDesconto(int tipoDesconto, double quantidade) {
		if (tipoDesconto == 1) {
			this.preco += quantidade;
		} else if (tipoDesconto == 2) {
			this.preco -= quantidade;
		} else {
			System.out.println("Tipo de desconto inválido.");
		}
	}
	
	public static int acrescentaId(){
		return id += 1;
	}

	public static void informarClasse() {}
	
}
