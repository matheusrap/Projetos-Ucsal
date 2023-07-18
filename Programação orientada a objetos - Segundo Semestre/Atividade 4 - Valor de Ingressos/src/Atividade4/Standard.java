package Atividade4;


// Class Standard
public class Standard extends Ingresso {
	double valorStandard;
	
// Construtor	
	public Standard (double valorIngresso, double valorStandard) {
		super(valorIngresso);
		this.valorStandard = valorIngresso;
						
	}

// Método	
	public void ingressoNormal() {
		super.imprimeIngresso();
		System.out.println("Valor do Ingresso Normal: R$ " + this.valorStandard);
	}
	

}