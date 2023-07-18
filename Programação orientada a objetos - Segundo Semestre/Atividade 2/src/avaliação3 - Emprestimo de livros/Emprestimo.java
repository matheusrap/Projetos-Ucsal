package avaliação3;

import java.util.Date;

public class Emprestimo {
	Date dataEmprestimo;
	Livro nomeLivro;
	Usuario nomeUsuario;
	
	
	public Emprestimo(Date dataEmprestimo, Livro nomeLivro, Usuario nomeUsuario) {
		super();
		this.dataEmprestimo = dataEmprestimo;
		this.nomeLivro = nomeLivro;
		this.nomeUsuario = nomeUsuario;
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Livro getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(Livro nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public Usuario getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(Usuario nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	
	
	
}
