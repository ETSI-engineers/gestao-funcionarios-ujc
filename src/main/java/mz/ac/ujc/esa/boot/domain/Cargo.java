package mz.ac.ujc.esa.boot.domain;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity
@Table(name="CARGOS")
public class Cargo extends AbstractEntity<Long> {

	@Column (name="nome", nullable=false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne 
	@JoinColumn(name="departamento_id_fk", nullable=false)
	private Departamento departamento;
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "funcionario_id_fk")
	private Funcionario funcionario;

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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
