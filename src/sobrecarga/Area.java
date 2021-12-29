package sobrecarga;

public class Area {
	
    double area;
    double lado;
    double base;
    double altura;
    double baseMaior;
    double baseMenor;
    
	public void caulcularArea(double lado) {
		 this.lado = lado;
		 area = lado * lado;
		 System.out.println("A área do quadrado é: " + area);
	}
	public void caulcularArea(double base, double altura) {
		 this.base = base;
		 this.altura = altura;
		 area = base * altura;
		 System.out.println("A área do retângulo é: " + area);
	}
	public void caulcularArea(double baseMaior, double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		area = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("A área do trapézio é: " + area);
		
	}
	
}
