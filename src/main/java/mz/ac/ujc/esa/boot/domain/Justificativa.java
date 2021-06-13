package mz.ac.ujc.esa.boot.domain;

import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "JUSTIFICATIVA_FALTAS")
public class Justificativa extends AbstractEntity<Long> {

	@Column(name = "data_justificativa", columnDefinition = "DATE") 
	private LocalDate data;
	
	@Column (name = "estado_aprovacao", nullable = false, unique = true, length = 9)
	private String estado;
	
	@OneToOne
	@JoinColumn(name = "falta_id_fk")
	private Falta falta;
	
	@ManyToOne
	@JoinColumn(name = "funcionario_id_fk")
	private Funcionario funcionario;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Falta getFalta() {
		return falta;
	}

	public void setFalta(Falta falta) {
		this.falta = falta;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
