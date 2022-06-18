package com.orientaçãoObjeto;

public class TestaArray {
	
	public static void main(String [] args) {

		Conta[] contas = new Conta[10];
		
		for (int i = 0; i< contas.length; i ++) {
			Conta conta = new Conta();
			conta.depositar(i * 10.00);
			System.out.println(conta.getSaldo());
			contas[i] = conta;
		}
		
		double soma = 0;
		for(int i = 0; i < contas.length; i ++) {
			soma += contas[i].getSaldo();	
		}
		double media = (soma/contas.length);
		System.out.println("A média dos saldos é: "+media);
		
	}
}
