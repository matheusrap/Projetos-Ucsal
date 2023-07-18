package Atividade4;

// Classe vip

public class Vip extends Ingresso{
	double adicionalVip;
	double valorVip;
	
// Construtor
	
	public Vip (double valorIngresso, double adicionalVip) {
		super(valorIngresso);
		this.adicionalVip = adicionalVip;
		
		valorVip = (valorIngresso + adicionalVip);
		
	}
// Método
	
	public double valorVip(){
		System.out.println("Valor do ingresso Vip: R$ " + this.valorVip);
		return valorVip;
		
	}
	
}
