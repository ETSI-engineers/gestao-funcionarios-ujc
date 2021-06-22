package mz.ac.ujc.esa.boot.domain;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="NIVEL_ACADEMICO")
public class NivelAcademico extends AbstractEntity<Long> {

	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private Nivel nivel;
}
