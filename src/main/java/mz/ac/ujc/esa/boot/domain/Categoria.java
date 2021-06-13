package mz.ac.ujc.esa.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name= "CATEGOTIAS")
public class Categoria extends AbstractEntity<Long> {

	@Column (name = "nome", nullable = false, unique = true)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="departamento_id_fk") 
	private Departamento departamento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}
