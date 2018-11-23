package academy.learnprogramming.model;

import java.time.LocalDate;
import java.util.Calendar;

public class Projeto {
	
	// == fields ==
	private int id;
	private String nome;
	private LocalDate data_inicio;
	private LocalDate data_previsao;
	private LocalDate data_fim;
	private String descricao;
	private String status;
	private Double orcamento ;
	private String risco;
	
	public Projeto() {}

	public Projeto(int id, String nome, LocalDate data_inicio, LocalDate data_previsao, LocalDate data_fim,
			String descricao, String status, Double orcamento, String risco) {
		this.id = id;
		this.nome = nome;
		this.data_inicio = data_inicio;
		this.data_previsao = data_previsao;
		this.data_fim = data_fim;
		this.descricao = descricao;
		this.status = status;
		this.orcamento = orcamento;
		this.risco = risco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(LocalDate data_inicio) {
		this.data_inicio = data_inicio;
	}

	public LocalDate getData_previsao() {
		return data_previsao;
	}

	public void setData_previsao(LocalDate data_previsao) {
		this.data_previsao = data_previsao;
	}

	public LocalDate getData_fim() {
		return data_fim;
	}

	public void setData_fim(LocalDate data_fim) {
		this.data_fim = data_fim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", data_inicio=" + data_inicio + ", data_previsao="
				+ data_previsao + ", data_fim=" + data_fim + ", descricao=" + descricao + ", status=" + status
				+ ", orcamento=" + orcamento + ", risco=" + risco + "]";
	}
	

}
