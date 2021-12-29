package finais;

public class Markup {
	final double MARKUP = 1.54;
	double compra;
	double venda;
	
	final void calcularPrecoVenda(double compra) {
		this.compra = compra;
		this.venda = compra * MARKUP;
		System.out.print("O preço de venda do produto é R$" + venda);
	}
}
