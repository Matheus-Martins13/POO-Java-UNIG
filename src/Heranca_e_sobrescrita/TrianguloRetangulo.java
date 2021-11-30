package Heranca_e_sobrescrita;

public class TrianguloRetangulo extends Model{

	public TrianguloRetangulo(float base, float altura) {
		super(base, altura);
	}
	
	public float area() {
		return (this.base * this.altura / 2);
	}
	
}
