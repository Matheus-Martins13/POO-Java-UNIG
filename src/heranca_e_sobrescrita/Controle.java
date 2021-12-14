package heranca_e_sobrescrita;

public class Principal {

	public static void main(String[] args) {
		Triangulo retangulo = new Retangulo(3.14, 13.4);
		TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(14.1, 12.4);
		
		System.out.println("Área do triângulo: " + retangulo.area());
		System.out.println("Área do triângulo retângulo: " + trianguloRetangulo.area());
		
	}

}
