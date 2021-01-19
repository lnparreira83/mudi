package br.com.alura.jpa.modelo;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titular;
	private Integer agencia;
	private Integer numero;
	private Double saldo;

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	@OneToMany(mappedBy = "conta", fetch = FetchType.EAGER)
	private List<Movimentacao> movimentacoes;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
