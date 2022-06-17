package com.condicionais_lacos;

public class Exercicio3 {

	public static void main(String [] args) {
		
		/*
		 * 3.	 Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.
		 */
		
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
}
