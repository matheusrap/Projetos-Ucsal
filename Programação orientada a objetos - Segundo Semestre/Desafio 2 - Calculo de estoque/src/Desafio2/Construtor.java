package Desafio2;

public class Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producao producao = new Producao();
		
		producao.previsaoDemanda = 200;
		producao.producaoNormal = 250;
		producao.estoqueInicial = 50;
				
		
		producao.estoqueFinal = (producao.estoqueInicial + producao.producaoNormal)-producao.previsaoDemanda;
		
		System.out.println("O estoque final previsto para o mês é de: " +producao.estoqueFinal + " Unidades");
	}

}
