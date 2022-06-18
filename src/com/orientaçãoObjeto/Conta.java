package com.orientaçãoObjeto;

public class Conta {
	
	int numero;
	String titular;
	private double saldo;
	
	public boolean sacar(double quantidade) {
		if(this.getSaldo() < quantidade) {
			System.out.println("Saldo insuficiente!!");
			return false;
		}else {
			
		double novoSaldo = this.getSaldo() - quantidade;
		this.setSaldo(novoSaldo);
		System.out.println("Saque realizado com Sucesso!!");
		return true;
		}
	}
	
	public void depositar(double quantidade) {
		this.setSaldo(quantidade + this.getSaldo());
	}
	
	public boolean transferePara(Conta destino, double valor) {
		if(this.getSaldo() < valor) {
			System.out.println("Transferencia não autorizada, saldo insuficiente!");
			return false;
		}else {
			this.setSaldo(this.getSaldo() - valor);
			destino.setSaldo(destino.getSaldo() + valor);
			System.out.println("Transferencia realizada!!");
			return true;
		}
		
		
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
