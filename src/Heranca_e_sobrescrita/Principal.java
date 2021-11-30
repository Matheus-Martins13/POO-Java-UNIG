package Heranca_e_sobrescrita;

public class Principal {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(3.14f, 13.4f);
		TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(14.1f, 12.4f);
		
		System.out.println("Área do triângulo: " + triangulo.area());
		System.out.println("Área do triângulo retângulo: " + trianguloRetangulo.area());
		
	}

}
