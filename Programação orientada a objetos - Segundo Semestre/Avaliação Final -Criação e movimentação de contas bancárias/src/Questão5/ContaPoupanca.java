package Questão5;


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

	
	
// Método Depósito
	
	public double saldoFinal() {
		return saldoFinal;
		
	}
	
	
// Método Render juros
	
	public double jurosRendidos() {
		return jurosRendidos;
	}
	



}
