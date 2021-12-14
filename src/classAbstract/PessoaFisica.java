package classAbstract;

public class PessoaFisica extends Pessoa {

	String nome;
	int cpf;
	int rg;
	int idade;
	String titulacao;

	public PessoaFisica(String logradouro, double numero, String bairro, String cidade, String uf, int telefone,
			String email, String disciplinaMinistra, String nome, int cpf, int rg, int idade, String titulacao) {
		super(logradouro, numero, bairro, cidade, uf, telefone, email, disciplinaMinistra);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.titulacao = titulacao;
	}

}
