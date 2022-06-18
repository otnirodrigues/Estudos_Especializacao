package com.contas.modelo.bancoteste;

public class TestArray {
	
	public static void main(String [] args) {
		
		int[] idade = new int[4];
		String[] nome = {"Maria", "José", "João", "Mariana"};
		double[] altura = {1.78,1.65,1.80,1.60};
		
	 
		for (int i = 0; i < nome.length; i++) {
			System.out.println(
					"****************"+
					"\nNome: "+nome[i]+
					"\nIdade: "+ idade[i]+
					"\nAltura: "+ altura[i]);
		}
		
		
	}

}
