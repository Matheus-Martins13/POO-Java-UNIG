package Heranca;

public class VeiculoDeCarga extends Veiculo {

	float capacidadeMaxCarga;
	float altura;
	float largura;
	float profundidade;

	public VeiculoDeCarga(String espécie, String placa, String procedência, String marca, String modelo, int anoModelo,
			int anoFabricação, String chassi, String renavam, String combustível, String motor, float quilometragem,
			float consumoMedio, float capacidadeMaxCarga, float altura, float largura, float profundidade) {
		super(espécie, placa, procedência, marca, modelo, anoModelo, anoFabricação, chassi, renavam, combustível, motor,
				quilometragem, consumoMedio);
		this.capacidadeMaxCarga = capacidadeMaxCarga;
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}

}
