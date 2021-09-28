package br.com.psicologando.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Profissional {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProfissional", nullable = false)
	private Integer idProfissional;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "registro", nullable = false, unique = true)
	private String registro;
	
	@Column(name = "endereco", length = 200, nullable = false)
	private String endereco;
	
	@Column(name = "telefone", length = 14, nullable = false)
	private String telefone;
	
	//fazer o mapeamento do enum 
	private String tipo;
	
	@OneToMany
	private List<Paciente> paciente;
	
	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(Integer idProfissional, String nome, String registro, String endereco, String telefone,
			String tipo) {
		super();
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.registro = registro;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Profissional [idProfissional=" + idProfissional + ", nome=" + nome + ", registro=" + registro
				+ ", endereco=" + endereco + ", telefone=" + telefone + ", tipo=" + tipo + "]";
	}
	
}
