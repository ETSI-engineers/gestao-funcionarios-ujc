package mz.ac.ujc.esa.boot.domain;

import java.util.List;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity
@Table(name="CARGOS")
public class Cargo extends AbstractEntity<Long> {

	@Column (name="nome", nullable=false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne 
	@JoinColumn(name="departamento_id_fk")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "cargo")	
	private List<Funcionario> fucionarios;

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

	public List<Funcionario> getFucionarios() {
		return fucionarios;
	}

	public void setFucionarios(List<Funcionario> fucionarios) {
		this.fucionarios = fucionarios;
	}
	
	
}
