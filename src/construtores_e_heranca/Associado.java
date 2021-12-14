package construtores_e_heranca;


public class Associado extends Modelo{
	String situacao;
	int numeroAssociado;
	
	Associado(int id, String nome, int logradouro, float numero, int cep, String bairro, String cidade, String uf,
			int telefone, int cpfCnpj, String situacao, int numeroAssociado) {
		super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
		
		this.situacao = situacao;
		this.numeroAssociado = numeroAssociado;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getNumeroAssociado() {
		return numeroAssociado;
	}

	public void setNumeroAssociado(int numeroAsssociado) {
		this.numeroAssociado = numeroAsssociado;
	}
	
	
}
