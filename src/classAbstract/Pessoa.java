package classAbstract;

public abstract class Pessoa {
	String logradouro;
	double numero;
	String bairro;
	String cidade;
	String uf;
	int telefone;
	String email;
	String disciplinaMinistra;

	public Pessoa(String logradouro, double numero, String bairro, String cidade, String uf, int telefone, String email,
			String disciplinaMinistra) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
		this.disciplinaMinistra = disciplinaMinistra;
	}

}
