package classes_aninhadas;

public class Calculadora {
	double num1;
	double num2;

	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	class Soma {
		public String toString() {
			return "Soma: " + (Calculadora.this.num1 + Calculadora.this.num2);
		}
	}

	class Subtracao {
		public String toString() {
			return "Subtração: " + (Calculadora.this.num1 - Calculadora.this.num2);
		}
	}
		
	class Multiplicacao {
		public String toString() {
			return "Multiplicação: " + (Calculadora.this.num1 * Calculadora.this.num2);
		}
	}
	
	class Divisao {
		public String toString() {
			return "Divisão: " + (Calculadora.this.num1 / Calculadora.this.num2);
		}
	}
}
