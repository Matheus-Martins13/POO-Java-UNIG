package atividade_pratica;
// Classe abstrata 
public abstract class Produto implements Disponibilidade{
	// Atributos
	static int id;
	String nome;
	int quantidade;
	double preco;
	boolean disponibilidade;
	
	// Construtores
	public Produto(String nome, int quantidade, boolean disponibilidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.disponibilidade = disponibilidade;
		this.preco = preco;
		Produto.id = Produto.acrescentaId();
	}
	
	// Métodos	
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
	// Modificadores de acesso
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
