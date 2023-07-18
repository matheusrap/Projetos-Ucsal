package Questão5;

// Classe ContaCorrente
public class ContaCorrente extends Conta {
	double limite;
	double saque;
	
	
// Construtor
	public ContaCorrente(String nomeTitular, double saldo, int numero, int agencia, double limite, double saque) {
		super(nomeTitular, saldo, numero, agencia);
		this.limite = limite;
		this.saque = saque;
	}
	
	
// Método Sacar
	public double Sacar() {
		if(saque > saldo) {
			throw new RuntimeException("Saldo de saque insuficiente ");
		}
		else if (saque > limite) {
			throw new RuntimeException("Limite de saque excedido");
		}
		return saque;
		
	}
 
	
	
}
