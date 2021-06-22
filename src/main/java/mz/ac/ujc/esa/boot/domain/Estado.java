package mz.ac.ujc.esa.boot.domain;

public enum Estado {

	
	Aprovado("Aprovado"), Reprovado("Reprovado");
	
	private String estado;
	
	Estado (String estado){
		this.estado=estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
