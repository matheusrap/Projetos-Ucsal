import java.util.Random;
import java.util.Scanner;

public class Criar {

	 public static void main(String[] args){
	        // Declarando as vari�veis, Scanner e Random
	        String nome;
	        double inicial;
	        Scanner entrada = new Scanner(System.in);
	        Random numero = new Random();
	        int conta = 1 + numero.nextInt(9999);
	    
	        //Obtendo os dados iniciais do Cliente
	        System.out.println("Cadastrando novo cliente.");
	        System.out.print("Ente com seu nome: ");
	        nome = entrada.nextLine();
	        
	        System.out.print("Entre com o valor inicial depositado na conta: ");
	        inicial = entrada.nextDouble();
	        
	        //Criando a conta de um cliente
	        Conta minhaConta = new Conta();
	        minhaConta.iniciar();
	        
	        System.out.println("O n�mero da sua conta �: " + minhaConta);
	 }   
		    
		
}
