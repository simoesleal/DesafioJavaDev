package academy.learnprogramming.model;

import java.time.LocalDate;
import java.util.Calendar;

public class Pessoa {
	
	// == fields ==
	private int id;
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private String tipoFuncionario;

	
	public Pessoa() {}


	public Pessoa(int id, String nome, LocalDate dataNascimento, String cpf, String tipoFuncionario) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.tipoFuncionario = tipoFuncionario;
	}
	
	


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public String getTipoFuncionario() {
		return tipoFuncionario;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
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
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", tipoFuncionario=" + tipoFuncionario + "]";
	}
	
	

}