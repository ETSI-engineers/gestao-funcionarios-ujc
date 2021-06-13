package mz.ac.ujc.esa.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
	
	@Column (nullable = false)
	private String cidade;
	
	
	@Column (nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	private Distrito distrito;
	
	@Column (nullable = false)
	private String bairro;
	
	@Column (nullable = true)
	private String rua;

	@Column (nullable = false)
	private Integer numeroDeCasa;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumeroDeCasa() {
		return numeroDeCasa;
	}

	public void setNumeroDeCasa(Integer numeroDeCasa) {
		this.numeroDeCasa = numeroDeCasa;
	}

	
	
}
