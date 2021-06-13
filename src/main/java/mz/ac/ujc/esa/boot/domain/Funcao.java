package mz.ac.ujc.esa.boot.domain;
import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCOES")
public class Funcao extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique =true)
	private String nome;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id_fk")
	private Departamento departamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}