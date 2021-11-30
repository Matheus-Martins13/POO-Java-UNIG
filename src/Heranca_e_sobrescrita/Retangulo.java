package Heranca_e_sobrescrita;

public class Retangulo extends Area{
	
	
	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	public double area() {
		return (this.base * this.altura);
	}
	
}
