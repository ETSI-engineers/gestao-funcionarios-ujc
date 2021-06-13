package mz.ac.ujc.esa.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "TELEFONE")
public class Telefone extends AbstractEntity<Long> {

	@Column (nullable = false, length = 7) 
	@Enumerated(EnumType.STRING)
	private Operadora operadora;
	
	@Column(name = "contacto", nullable = false, unique = true)
	private Integer numero;
	
	@ManyToOne
	@JoinColumn(name="funcionario_id_fk") 
	private Funcionario funcionario;

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
