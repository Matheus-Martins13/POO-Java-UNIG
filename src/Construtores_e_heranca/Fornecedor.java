package Construtores_e_heranca;

public class Fornecedor extends Modelo{
	String nomeFantasia;
	String website;
	
	Fornecedor(int id, String nome, int logradouro, float numero, int cep, String bairro, String cidade, String uf,
			int telefone, int cpfCnpj, String nomeFantasia, String website) {
		super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
		
		this.nomeFantasia = nomeFantasia;
		this.website = website;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	
}
