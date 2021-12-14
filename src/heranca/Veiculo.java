package heranca;

public class Veiculo {
	String espécie;
	String placa;
	String procedência;
	String marca;
	String modelo;
	int anoModelo;
	int anoFabricação;
	String chassi;
	String renavam;
	String combustível;
	String motor;
	float quilometragem;
	float consumoMedio;

	public Veiculo(String espécie, String placa, String procedência, String marca, String modelo, int anoModelo,
			int anoFabricação, String chassi, String renavam, String combustível, String motor, float quilometragem,
			float consumoMedio) {
		super();
		this.espécie = espécie;
		this.placa = placa;
		this.procedência = procedência;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.anoFabricação = anoFabricação;
		this.chassi = chassi;
		this.renavam = renavam;
		this.combustível = combustível;
		this.motor = motor;
		this.quilometragem = quilometragem;
		this.consumoMedio = consumoMedio;
	}

}
