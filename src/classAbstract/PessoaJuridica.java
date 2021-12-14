package classAbstract;

public class PessoaJuridica extends Pessoa {
	String razaoSocial;
	String nomeFantasia;
	int inscricaoMunicipal;
	int inscricaoEstadual;
	int cnpj;
	String website;

	public PessoaJuridica(String logradouro, double numero, String bairro, String cidade, String uf, int telefone,
			String email, String disciplinaMinistra, String razaoSocial, String nomeFantasia, int inscricaoMunicipal,
			int inscricaoEstadual, int cnpj, String website) {
		super(logradouro, numero, bairro, cidade, uf, telefone, email, disciplinaMinistra);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.inscricaoEstadual = inscricaoEstadual;
		this.cnpj = cnpj;
		this.website = website;
	}

}
