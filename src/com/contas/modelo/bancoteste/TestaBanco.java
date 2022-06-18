package com.contas.modelo.bancoteste;

import com.orientaçãoObjeto.Conta;

public class TestaBanco{
	
	public static void main(String [] args) {
		Banco banco = new Banco("Sicoob", 1011);
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		
		c1.depositar(10000);
		c2.depositar(10000);
		c3.depositar(10000);
		
		banco.adiciona(c1);
		banco.adiciona(c2);
		banco.adiciona(c3);
		
		banco.mostrarConta();
	}

}
