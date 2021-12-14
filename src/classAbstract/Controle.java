package classAbstract;

public class Controle {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("Rua", 12, "Miguel Couto", "Nova Iguaçu", "RJ", 1234, "nome@email.com",
				"História", "Marcos", 12345, 12345, 20, "AlgumaTitulação");

		PessoaJuridica pj1 = new PessoaJuridica("Rua", 13, "Miguel Couto", "Nova Iguaçu", "RJ", 1234, "nome@email.com",
				"História", "Marcanizio", "AlgumNome", 1234, 5678, 12345678, "www.site.com");

		System.out.println("Pessoa Física:");
		System.out.println("Logradouro: " + pf1.logradouro);
		System.out.println("Número: " + pf1.numero);
		System.out.println("Bairro: " + pf1.bairro);
		System.out.println("Cidade: " + pf1.cidade);
		System.out.println("UF: " + pf1.uf);
		System.out.println("Telefone: " + pf1.telefone);
		System.out.println("E-mail de contato: " + pf1.email);
		System.out.println("Disciplinas que ministra " + pf1.disciplinaMinistra);
		System.out.println("Nome: " + pf1.nome);
		System.out.println("CPF: " + pf1.cpf);
		System.out.println("RG: " + pf1.rg);
		System.out.println("Idade: " + pf1.idade);
		System.out.println("Titulação: " + pf1.titulacao);

		System.out.println("\n");

		System.out.println("Pessoa Jurídica:");
		System.out.println("Logradouro: " + pj1.logradouro);
		System.out.println("Número: " + pj1.numero);
		System.out.println("Bairro: " + pj1.bairro);
		System.out.println("Cidade: " + pj1.cidade);
		System.out.println("UF: " + pj1.uf);
		System.out.println("Telefone: " + pj1.telefone);
		System.out.println("E-mail de contato: " + pj1.email);
		System.out.println("Disciplinas que ministra " + pj1.disciplinaMinistra);
		System.out.println("razão social: " + pj1.razaoSocial);
		System.out.println("Nome fantasia: " + pj1.nomeFantasia);
		System.out.println("inscrição municipal: " + pj1.inscricaoMunicipal);
		System.out.println("inscrição estadual: " + pj1.inscricaoEstadual);
		System.out.println("CNPJ: " + pj1.cnpj);
		System.out.println("website: " + pj1.website);

	}

}
