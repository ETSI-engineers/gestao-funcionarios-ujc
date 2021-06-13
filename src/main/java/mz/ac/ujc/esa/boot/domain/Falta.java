package mz.ac.ujc.esa.boot.domain;

import java.time.LocalDate;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name = "FALTAS")
public class Falta extends AbstractEntity<Long> {
	
	@Column(name = "data_falta", columnDefinition = "DATE") 
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name ="funcionario_id_fk")
	private Funcionario funcionario;	

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
