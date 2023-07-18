package avaliação3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emprestimo emprestimo = new Emprestimo(null, null, null);
		Livro livro = new Livro(null, null, null, null, 0, 0, 0);
		Usuario usuario = new Usuario(null, 0, null);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		
		date.setDate(27);
		date.setMonth(10);
		date.setYear(122);
		livro.setNomeLivro("A seita dos Assassinos");
		livro.setAutores ("Licia Troisi");
		livro.setArea ("Área 2");
		livro.setEditora("Rocco");
		livro.setAno(2006);
		livro.setEdicao(1);
		livro.setNumeroFolhas (450);
		usuario.setNomeUsuario("João Xavier");
		usuario.setIdade (26);
		usuario.setTelefone("71992265669");
		
		System.out.println("Data de Empréstimo: " + sdf.format(date));
		System.out.println("Nome do Livro: " + livro.getNomeLivro());
		System.out.println("Nome do Usuário: " + usuario.getNomeUsuario());
		
	
				
				
				

	}

}
