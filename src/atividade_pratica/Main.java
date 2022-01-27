package atividade_pratica;

public class Main {

	public static void main(String[] args) {
		ProdutoCasa mesa = new ProdutoCasa("Mesa de centro", 10, true, 200, "marrom", "madeira de carvalho");
		ProdutoEletronico televisao = new ProdutoEletronico("Televisão", 12, true, 1200, 127, 20);
		ProdutoEsportivo raquete = new ProdutoEsportivo("Raquete de tênis", 35, true, 20, "tênis", "plástico",
				"Babolat");
		ProdutoIndustrial caldeira = new ProdutoIndustrial("Caldeira", 4, true, 4000,
				"Caldeira a gás com rendimento térmico superior a 88%", "metalúrgica");
		ProdutoLazer piscina = new ProdutoLazer("Piscina", 30, true, 150, "Lazer aquático", "Piscina de 20.000L");
		ProdutoPesca vara = new ProdutoPesca("Vara de pesca", 24, true, 200, "Madeira e fibras de visro");
		ProdutoPetShop brinquedoGato = new ProdutoPetShop("Brinquedo felpudo para gatos", 300, true, 5, "gato",
				"brinquedo");
		
		
		mesa.str();
		televisao.str();
		raquete.str();
		caldeira.str();
		piscina.str();
		vara.str();
		brinquedoGato.str();

	}

}
