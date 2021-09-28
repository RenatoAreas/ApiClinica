package br.com.psicologando.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "paciente")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPaciente", nullable = false)
	private Integer idPaciente;
	
	@Column (name = "nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "endereco", length = 200, nullable = false)
	private String endereco;
	
	@Column(name = "telefone", length = 11, nullable = false)
	private String telefone;
	
	@Column(name = "cpf", length = 14, nullable = false)
	private String cpf;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@ManyToMany
	private List<Profissional> profissional;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Paciente(Integer id, String nome, String endereco, String telefone, String cpf, String email) {
		super();
		this.idPaciente = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
	}

	public Integer getId() {
		return idPaciente;
	}

	public void setId(Integer id) {
		this.idPaciente = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + idPaciente + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cpf="
				+ cpf + ", email=" + email + "]";
	} 
}
