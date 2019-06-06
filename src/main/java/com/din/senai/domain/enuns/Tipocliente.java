package com.din.senai.domain.enuns;

public enum Tipocliente {
PESSOAFISICA(1,"pessoa Física "), PESSOAJURIDICA(2, "Pessoa Jurídica");

private int cod;
	private String descricao;
	private Tipocliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
public static Tipocliente toEnum(Integer cod) {
	
	if(cod == null) {
		return null;
		
	}
		for (Tipocliente x : Tipocliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inválido" +  cod );
}
}
