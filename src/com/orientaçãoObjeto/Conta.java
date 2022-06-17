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
	
	public boolean transferePara(Conta destino, double valor) {
		if(this.saldo < valor) {
			System.out.println("Transferencia não autorizada, saldo insuficiente!");
			return false;
		}else {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
			System.out.println("Transferencia realizada!!");
			return true;
		}
		
		
		
	}

}
