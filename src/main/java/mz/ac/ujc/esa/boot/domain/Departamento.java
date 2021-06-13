package mz.ac.ujc.esa.boot.domain;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "Departamentos")
public class Departamento extends AbstractEntity<Long> {

		@Column (name ="nome", nullable = false, unique = true, length = 60)
		private String nome;

		@OneToMany(mappedBy = "departamento") 
		private List<Cargo> cargos;
		
		@ManyToOne
		@JoinColumn(name="direcao_id_fk") 
		private Direcao direcao;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<Cargo> getCargos() {
			return cargos;
		}

		public void setCargos(List<Cargo> cargos) {
			this.cargos = cargos;
		}

		public Direcao getDirecao() {
			return direcao;
		}

		public void setDirecao(Direcao direcao) {
			this.direcao = direcao;
		}
		
		
}