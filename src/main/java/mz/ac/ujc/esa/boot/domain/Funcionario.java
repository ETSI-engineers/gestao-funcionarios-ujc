package mz.ac.ujc.esa.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
	
	@Column(nullable=false, unique =true)
	private String nome;
	
	@Column(name = "data_nascimento", nullable = false, columnDefinition = "DATE")
	private Date data_nasc;
	
	@Column(name = "data_entrada",nullable=false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;

	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "endereco_id_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name ="cargo_id_fk")
	private Cargo cargo;
	
	@ManyToOne
	@JoinColumn(name = "funcao_id_fk")
	private Funcao funcao;
	
	@Column(nullable=false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00") // indica ao jpa que deve usar tipo de dados decimla com 7 digitos e duas casas decimais
	private BigDecimal salario;
	
	@ManyToOne
	@JoinColumn(name ="cartegoria_id_fk")
	private Categoria categotia;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Categoria getCategotia() {
		return categotia;
	}

	public void setCategotia(Categoria categotia) {
		this.categotia = categotia;
	}
	
	
}
