package Desafio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aluno aluno = new aluno();
		
		aluno.nomeAluno = "Matheus Pereira";
		aluno.endereco = "Rua das flores, 515, casa 03";
		aluno.telefone = 952863352;
		aluno.email = "matheusp@hotmail.com";
		aluno.matricula = 765245151;
		
		System.out.println("Nome do aluno: " + aluno.nomeAluno);
		System.out.println("Endereço: " + aluno.endereco);
		System.out.println("Telefone: " + aluno.telefone);
		System.out.println("E-mail: " + aluno.email);
		System.out.println("Matricula: " + aluno.matricula);
		
		
		
	}

}
