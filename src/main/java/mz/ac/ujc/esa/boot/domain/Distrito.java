package mz.ac.ujc.esa.boot.domain;

public enum Distrito {

	KVT("KVT","Kamavota"),
	KPM("KPM", "Kampfumo");
	
	private String sigla;
	private String descricao;
	
	Distrito(String sigla, String descricao) {
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
