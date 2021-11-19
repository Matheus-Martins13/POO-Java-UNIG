package Construtores_e_heranca;

public class Principal {

	public static void main(String[] args) {

		Associado assoc = new Associado(1, "João", 12345, 3.14F, 123123, "Miguel Couto", "Nova Iguaçu",
				"Rio de Janeiro", 1234589, 111111, "AlgumaSituaçao", 0);
		
		Colaborador colab = new Colaborador(2, "Paulo", 12345, 3.14F, 123123, "Miguel Couto", "Nova Iguaçu",
				"Rio de Janeiro", 1234589, 111111, "AlgumCargo");
		
		Fornecedor fornec = new Fornecedor(3, "Marcos", 12345, 3.14F, 123123, "Miguel Couto", "Nova Iguaçu",
				"Rio de Janeiro", 1234589, 111111, "AlgumNomeFantasia", "www.site.com");
		
		System.out.println("Associado: ");
		System.out.println("Id: " + assoc.id);
		System.out.println("Nome: " + assoc.nome);
		System.out.println("Logradouro: " + assoc.logradouro);
		System.out.println("Número: " + assoc.numero);
		System.out.println("CEP: " + assoc.cep);
		System.out.println("Bairro:" + assoc.bairro);
		System.out.println("Cidade: " + assoc.cidade);
		System.out.println("UF: " + assoc.uf);
		System.out.println("Telefone: " + assoc.telefone);
		System.out.println("CPF ou CNPJ: " + assoc.cpfCnpj);
		System.out.println("Situação: " + assoc.situacao);
		System.out.println("Número de associado: " + assoc.numeroAssociado);
		System.out.println("------------");
		
		System.out.println("Colaborador: ");
		System.out.println("Id: " + colab.id);
		System.out.println("Nome: " + colab.nome);
		System.out.println("Logradouro: " + colab.logradouro);
		System.out.println("Número: " + colab.numero);
		System.out.println("CEP: " + colab.cep);
		System.out.println("Bairro:" + colab.bairro);
		System.out.println("Cidade: " + colab.cidade);
		System.out.println("UF: " + colab.uf);
		System.out.println("Telefone: " + colab.telefone);
		System.out.println("CPF ou CNPJ: " + colab.cpfCnpj);
		System.out.println("Cargo: " + colab.cargo);
		System.out.println("------------");
		
		System.out.println("Associado: ");
		System.out.println("Id: " + fornec.id);
		System.out.println("nome: " + fornec.nome);
		System.out.println("Logradouro: " + fornec.logradouro);
		System.out.println("Número: " + fornec.numero);
		System.out.println("CEP: " + fornec.cep);
		System.out.println("Bairro:" + fornec.bairro);
		System.out.println("Cidade: " + fornec.cidade);
		System.out.println("UF: " + fornec.uf);
		System.out.println("Telefone: " + fornec.telefone);
		System.out.println("CPF ou CNPJ: " + fornec.cpfCnpj);
		System.out.println("Nome fantasia: " + fornec.nomeFantasia);
		System.out.println("Website: " + fornec.website);
		System.out.println("------------");

	}
}
