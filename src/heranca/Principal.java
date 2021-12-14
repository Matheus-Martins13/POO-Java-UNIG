package heranca;
import heranca.VeiculoDeCarga;
import heranca.VeiculoDePassageiros;

public class Principal {

	public static void main(String[] args) {
		VeiculoDePassageiros uno = new VeiculoDePassageiros(null, null, null, null, null, 0, 0, null, null, null, null, 0, 0, "vermelho", null, 0, 0, null);
		VeiculoDeCarga toco = new VeiculoDeCarga(null, null, null, null, null, 0, 0, null, null, null, null, 0, 0, 6000, 0, 0, 0);
		
		System.out.println(uno.corExterna);
		System.out.println(toco.capacidadeMaxCarga);
	}

}
