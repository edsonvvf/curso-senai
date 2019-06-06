package com.din.senai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.din.senai.domain.enuns.Tipocliente;

@Entity
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nome;
	private String cpfouCnpj;
	private Integer tipo;

	@Column(unique = true)
	private String email;

	@ElementCollection
	@CollectionTable(name = "TELEFONE")
	private Set<String> telefones = new HashSet<>();

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();

	public List<Endereco> getEnderecos() {
		return enderecos;
	}



	public Cliente() {

	}

	public Cliente(Integer idCliente, String nome, String cpfouCnpj, String email, Tipocliente tipo) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpfouCnpj = cpfouCnpj;
		this.email = email;
		this.tipo = tipo.getCod();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfouCnpj() {
		return cpfouCnpj;
	}

	public void setCpfouCnpj(String cpfouCnpj) {
		this.cpfouCnpj = cpfouCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

	public Tipocliente getTipo() {
		return Tipocliente.toEnum(tipo);
	}

	public void setTipo(Tipocliente tipo) {
		this.tipo = tipo.getCod();
	}

}
