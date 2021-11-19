package Heranca;

public class VeiculoDePassageiros extends Veiculo {

	String corExterna;
	String corInterna;
	int numeroPortas;
	int numeroPassageiros;
	String opcionais;
	
	public VeiculoDePassageiros(String espécie, String placa, String procedência, String marca, String modelo,
			int anoModelo, int anoFabricação, String chassi, String renavam, String combustível, String motor,
			float quilometragem, float consumoMedio, String corExterna, String corInterna, int numeroPortas,
			int numeroPassageiros, String opcionais) {
		super(espécie, placa, procedência, marca, modelo, anoModelo, anoFabricação, chassi, renavam, combustível, motor,
				quilometragem, consumoMedio);
		this.corExterna = corExterna;
		this.corInterna = corInterna;
		this.numeroPortas = numeroPortas;
		this.numeroPassageiros = numeroPassageiros;
		this.opcionais = opcionais;
	}

}
