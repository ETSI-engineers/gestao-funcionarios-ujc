package mz.ac.ujc.esa.boot.domain;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="AUTORIZACAO")
public class Autorizacao extends AbstractEntity<Long> {

	@Column(name = "data", columnDefinition = "DATE")
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name ="funcionario_id_fk")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name ="reqFerias_id_fk")
	private ReqFerias reqFerias;
	
}
