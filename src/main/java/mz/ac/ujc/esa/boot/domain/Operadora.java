package mz.ac.ujc.esa.boot.domain;

public enum Operadora {

	VODACOM("VODACOM","VODACOM SA"),
	TMCEL("TMCEL", "TMCEL Mz"),
	MOVITEL("MOVITEL", "MOVITEL");
	
	private String sigla;
	private String descricao;
	
	private Operadora(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
