package mz.ac.ujc.esa.boot.domain;

import java.time.LocalDate;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name="REQ_FERIAS")
public class ReqFerias extends AbstractEntity<Long> {

	@Column(name = "data_inicio", columnDefinition = "DATE")
	private LocalDate data_inicio;
	
	@Column(name = "data_fim", columnDefinition = "DATE")
	private LocalDate data_fim;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	@ManyToOne
	@JoinColumn(name ="funcionario_id_fk")
	private Funcionario funcionario;

	public LocalDate getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(LocalDate data_inicio) {
		this.data_inicio = data_inicio;
	}

	public LocalDate getData_fim() {
		return data_fim;
	}

	public void setData_fim(LocalDate data_fim) {
		this.data_fim = data_fim;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
