package Quest�o5;


// Class ContaPoupanca
public class ContaPoupanca extends Conta {
	double taxaJuros;
	double deposito;
	double saldoFinal;
	int tempo;
	double jurosRendidos;
	
// Construtor
public ContaPoupanca(String nomeTitular, double saldo, int numero, int agencia, double taxaJuros, double deposito, int tempo) {
	super(nomeTitular, saldo, numero, agencia);
	this.taxaJuros = taxaJuros;
	this.deposito = deposito;
	this.tempo = tempo;
	
	
	
	saldoFinal = saldo + deposito;
	jurosRendidos = taxaJuros * saldoFinal * tempo;
	
	}

	
	
// M�todo Dep�sito
	
	public double saldoFinal() {
		return saldoFinal;
		
	}
	
	
// M�todo Render juros
	
	public double jurosRendidos() {
		return jurosRendidos;
	}
	



}
