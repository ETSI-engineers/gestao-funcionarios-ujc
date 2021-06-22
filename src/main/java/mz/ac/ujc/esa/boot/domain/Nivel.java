package mz.ac.ujc.esa.boot.domain;

public enum Nivel {

	Licenciatura("Licenciatura", "Licenciatura"),
	Mestrado("Mestrado", "Msc."),
	Doutoramento("Doutoramento", "Dr.");
	
	private String sigla;
	private String descricao;
	
	Nivel(String sigla, String descricao) {
		
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
