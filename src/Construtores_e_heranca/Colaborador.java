package Construtores_e_heranca;

public class Colaborador extends Modelo {
	String cargo;
	
	Colaborador(int id, String nome, int logradouro, float numero, int cep, String bairro, String cidade, String uf,
			int telefone, int cpfCnpj, String cargo) {
		super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
		
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
