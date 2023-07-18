package avaliação3;

public class Livro {
	String nomeLivro;
	String autores;
	String area;
	String editora;
	int ano;
	int edicao;
	int numeroFolhas;
	
	public Livro(String nomeLivro, String autores, String area, String editora, int ano, int edicao, int numeroFolhas) {
		super();
		this.nomeLivro = nomeLivro;
		this.autores = autores;
		this.area = area;
		this.editora = editora;
		this.ano = ano;
		this.edicao = edicao;
		this.numeroFolhas = numeroFolhas;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getNumeroFolhas() {
		return numeroFolhas;
	}
	public void setNumeroFolhas(int numeroFolhas) {
		this.numeroFolhas = numeroFolhas;
	}
}
