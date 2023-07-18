package avaliação;

import java.util.Date;

public class jogadordefutebol {
	String nome;
	String posicao;
	Date nascimento;
	String nacionalidade;
	Double altura;
	Double peso;
	
	
	
	public jogadordefutebol(String nome, String posicao, Date nascimento, String nacionalidade, Double altura,
			Double peso) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		this.nascimento = nascimento;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
}
