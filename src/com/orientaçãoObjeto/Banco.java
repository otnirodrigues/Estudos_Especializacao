package com.orientaçãoObjeto;

public class Banco {

	public static void main(String[] args) {

		Conta c1,c2;
		c1 = new Conta();
		c2 = new Conta();
		
		c1.titular = "Rodrigues";
		c1.saldo = 21000.00;

		System.out.println("Saldo atual: "+ c1.saldo);
		
		c1.sacar(2000.000);
		c1.depositar(2000.00);
		
		System.out.println(c1.saldo);

		c1.transferePara(c2, 5000.00);
		System.out.println("Saldo Conta1: "+c1.saldo+"\nSaldo Conta2: " + c2.saldo);
	}

}
