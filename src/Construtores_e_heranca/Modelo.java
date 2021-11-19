package Construtores_e_heranca;

public class Modelo {
	int id;
	String nome;
	int logradouro;
	float numero;
	int cep;
	String bairro;
	String cidade;
	String uf;
	int telefone;
	int cpfCnpj;
	
	Modelo(int id, String nome, int logradouro, float numero, int cep, String bairro, String cidade, String uf,
			int telefone, int cpfCnpj)
	{
		
		this.id = id;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.cpfCnpj = cpfCnpj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(int logradouro) {
		this.logradouro = logradouro;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(int cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
}
