package br.com.impacta.aplicacao;

public class AppArray01 {

	public static void main(String[] args) {
		//definindo um array de inteiros
		int[] numeros = new int [5];
		
		//atribuir os valores individualmente.
		numeros[0] = 20;
		numeros[1] = 10;
		numeros[2] = -12;
		numeros[3] = 0;
		numeros[4] = 8;
		
		for (int i =0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
	}

}
