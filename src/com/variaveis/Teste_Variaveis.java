package com.variaveis;

public class Teste_Variaveis {
	
	public static void main(String [] args) {
		
		/**
		 * Na	 empresa	 em	 que	trabalhamos,	 há	tabelas	 com	 o	 gasto	 de	 cada	 mês.	 Para	 fechar	 o	 balanço	 do
		 * primeiro	trimestre,	 precisamos	 somar	 o	 gasto	total.	Sabendo	 que,	em	janeiro,	 foram	 gastos	 15	mil
		 * reais,	em	fevereiro,	23	mil	reais	e,	em	março,	17	mil	reais,	faça	um	programa	que	calcule	e	imprima
		 * a	despesa	total	no	trimestre	e	a	média	mensal	de	gastos
		 */
		
		double Janeiro;
		double Fevereiro;
		double Marco;
		double Calculo_trimestre;
		double media_gastos;
		
		
		Janeiro = 15.000;
		Fevereiro = 23.000;
		Marco = 17.000;
		Calculo_trimestre = Janeiro+Fevereiro+Marco;
		media_gastos = Calculo_trimestre/3;
		
		System.out.println("Gastos Trimestrais: "+Calculo_trimestre);
		System.out.println("Média de gastos Mensais: "+media_gastos);
			
	}

}
