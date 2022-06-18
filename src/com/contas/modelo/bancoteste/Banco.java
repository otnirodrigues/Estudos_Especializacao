package com.contas.modelo.bancoteste;

import com.orientaçãoObjeto.Conta;

public class Banco{

	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
		
	}
	
	public void adiciona(Conta c) {
		for(int i = 0; i < contas.length; i++) {
			if (this.contas[i] == null) {
				this.contas[i] = c;
							
			}else {
				System.out.println("Não temos mais espaço para contas!!");
				break;
			}
		}
	}
	
	public void mostrarConta() {
		for (int i = 0; i < contas.length; i ++) {
			if (contas != null) {
				System.out.println("Conta: " + i);
			}else {
				break;
			}
			
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
