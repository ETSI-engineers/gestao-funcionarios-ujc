package mz.ac.ujc.esa.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="TIPO")
public class Tipo extends AbstractEntity<Long> {

	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private Designacao designacao;
}
