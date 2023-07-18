package Quest�o5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teste do Saldo da Conta
		Conta c = new Conta("Matheus Pereira", 250.0, 45565, 1234);
		System.out.println("Nome do titular: " +c.nomeTitular);
		System.out.println("Ag�ncia: " +c.agencia);
		System.out.println("N�mero da conta: " +c.numero);
		System.out.println("Seu saldo �: R$ " + c.saldo);
		
		// Teste de Saque
		try {
		ContaCorrente cc = new ContaCorrente("Matheus Pereira", 250.0, 45565, 1234, 100.0, 260.0);
		System.out.println(cc.Sacar());
		}
		catch(RuntimeException e){
			System.out.println(e. getMessage());
		}
		
		// Teste Dep�sito
		ContaPoupanca cp = new ContaPoupanca("Matheus Pereira", 250.0, 45565, 1234, 0.2, 60.0, 2);
		System.out.println("Dep�sito realizado: R$ "+ cp.deposito);
		System.out.println("Saldo final: R$ " + cp.saldoFinal);
		
		
		// Teste Rendimento de Juros
		ContaPoupanca j = new ContaPoupanca("Matheus Pereira", 250.0, 45565, 1234, 0.2, 60.0, 2);
		System.out.println("Juros Rendidos: R$ " + j.jurosRendidos);
		
		
		
	}

}
