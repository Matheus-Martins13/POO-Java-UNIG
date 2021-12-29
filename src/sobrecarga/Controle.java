package sobrecarga;

public class Controle {

	public static void main(String[] args) {
		Area quadrado = new Area();
		Area retangulo = new Area();
		Area trapezio = new Area();
		
		quadrado.caulcularArea(10);
		retangulo.caulcularArea(20, 13);
		trapezio.caulcularArea(30, 20, 10);
	}

}
