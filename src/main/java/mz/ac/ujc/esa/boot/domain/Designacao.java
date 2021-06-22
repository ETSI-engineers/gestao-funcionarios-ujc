package mz.ac.ujc.esa.boot.domain;

public enum Designacao {

	CTA("CTA"),DOCENTE("DOCENTE");
	
	private String designacao;
	
	Designacao(String designacao) {
		this.designacao = designacao;

	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	

	

	
	
	
}
