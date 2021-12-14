package heranca_e_sobrescrita;

public class TrianguloRetangulo extends Area{

	public TrianguloRetangulo(double base, double altura) {
		super(base, altura);
	}
	
	public double area() {
		return (this.base * this.altura / 2);
	}
	
}
