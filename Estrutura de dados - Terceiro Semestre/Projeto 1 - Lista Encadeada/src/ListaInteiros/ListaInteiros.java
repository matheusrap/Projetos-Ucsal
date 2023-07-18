package ListaInteiros;

public class ListaInteiros {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	// Método adicionar
	
	public void adicionar(Identificacao valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
	
	// Testando se a lista tem dados
		if(primeiro == null && ultimo == null) { 
			primeiro = celula; 
			ultimo = celula; 
		}else {
			ultimo.setProximo(celula);
		    ultimo = celula;
		}
}
	
	// Método remover
	
	public void remover() {
		
		if(primeiro.getProximo()!= null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			ultimo.setProximo(null);
		}else {
			primeiro = ultimo = null;
		
		}
	}
	// Recuperando a penúltima célula
	
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}												                      
		return recuperarPenultimo(celula.getProximo());
		
	}
	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		}else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo()!=null ?true : false;
			posicaoAtual= posicaoAtual.getProximo();
			return temProximo;
		}
	}
	
	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}


	public void setPosicaoAtual(Celula posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}
}
