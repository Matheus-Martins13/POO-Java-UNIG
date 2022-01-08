package classes_aninhadas;

public class Controle {

	public static void main(String[] args) {
		Calculadora.Soma soma = new Calculadora(24.0, 2.0).new Soma();
		Calculadora.Subtracao sub = new Calculadora(24.0, 2.0).new Subtracao();
		Calculadora.Multiplicacao mult = new Calculadora(24.0, 2.0).new Multiplicacao();
		Calculadora.Divisao div = new Calculadora(24.0, 2.0).new Divisao();
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
	}

}
