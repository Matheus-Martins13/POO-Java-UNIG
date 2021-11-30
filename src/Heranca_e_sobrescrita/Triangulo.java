package Heranca_e_sobrescrita;

public class Triangulo extends Model{
	
	
	public Triangulo(float base, float altura) {
		super(base, altura);
	}
	
	public float area() {
		return (this.base * this.altura / 2);
	}
	
}
