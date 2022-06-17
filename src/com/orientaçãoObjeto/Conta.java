package com.orientaçãoObjeto;

public class Conta {
	
	int numero;
	String titular;
	double saldo;
	
	public boolean sacar(double quantidade) {
		if(this.saldo < quantidade) {
			System.out.println("Saldo insuficiente!!");
			return false;
		}else {
			
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		System.out.println("Saque realizado com Sucesso!!");
		return true;
		}
	}
	
	public void depositar(double quantidade) {
		this.saldo = quantidade + this.saldo;
	}

}
