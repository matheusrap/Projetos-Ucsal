package ListaInteiros;

public class TestaListaInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestaListaInteiros testaListaInteiros = new TestaListaInteiros();
		ListaInteiros listaInteiros = new ListaInteiros();
		
		// Adicionando Identificações
		
		testaListaInteiros.addIdentificacao(listaInteiros);
		System.out.println("Todas as identificações Adicionadas");
		System.out.println("Lista de Identificações");
		while (listaInteiros.temProximo()) {
			System.out.println(listaInteiros.getPosicaoAtual().getValor().getNome());
		
		}
		
		//Removendo Identificações
		
		testaListaInteiros.removerIdentificacao(listaInteiros);
		System.out.println("Identificação removido");
		System.out.println("A lista ficou assim: ");
		while (listaInteiros.temProximo()) {
			System.out.println(listaInteiros.getPosicaoAtual().getValor().getNome());
		}
		
}
	public void addIdentificacao(ListaInteiros listaInteiros) {
		Identificacao identificacao1 = new Identificacao(1, "João"); //valor1
		Identificacao identificacao2 = new Identificacao(2, "Marcos"); //valor2		
		Identificacao identificacao3 = new Identificacao(3, "Matheus"); //valor3		
		Identificacao identificacao4 = new Identificacao(4, "Maria"); //valor4		
		Identificacao identificacao5 = new Identificacao(5, "Luana"); //valor5
		
		listaInteiros.adicionar(identificacao1);
		listaInteiros.adicionar(identificacao2);
		listaInteiros.adicionar(identificacao3);
		listaInteiros.adicionar(identificacao4);
		listaInteiros.adicionar(identificacao5);
	}
	
	public void removerIdentificacao(ListaInteiros listaInteiros) {
		listaInteiros.remover();
	}
}
