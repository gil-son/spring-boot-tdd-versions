package br.com.algaworks.filmes.model;


public class Filme {

	private Long codigo;
	private String titulo;
	private String descricao;
	
	
	public Filme() {}
	
	
	public Filme(Long codigo, String titulo, String descricao) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
