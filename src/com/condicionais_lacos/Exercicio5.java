package com.condicionais_lacos;

public class Exercicio5 {
	
	public static void main(String [] args) {
		
		/*
		 *  (Opcional)	 Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
		 *  Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
		 *  segundo	vale 1,	e	daí	por	diante.	O	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)-
		 *  ésimo	elemento	(ex:	8	=	5	+	3).

		 */
		
		int cont = 0;
		long n1 = 0;
		long n2 = 1;
		long n3 = 0;
		
		while (cont <= 100) {
			if (cont == 0){
				System.out.println(n1);
				cont ++;
				System.out.println(n2);
				cont ++;
			}else{
				n3 = n1;
				System.out.println(n2+n1);
				cont ++;
				n1 = n2;
				n2 = (n3+n1);
			}
			
		}
		
	}

}
