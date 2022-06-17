package com.condicionais_lacos;

public class Exercicio4 {
	
	public static void main(String [] args) {
		
		/*
		 * 4.	 Imprima	os	fatoriais	de	1	a	10.
		 */
		
		int fatorial = 1;
		for (int n = 1; n < 11; n++) {
			fatorial = n * fatorial;
			System.out.println(fatorial);
		}
		
	}
		

}
