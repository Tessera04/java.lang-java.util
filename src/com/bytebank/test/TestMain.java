package com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Quiero agruparlas en una sola referencia
		//CREO UN ARRAY O ARREGLO
		//EMPIEZA A CONTAR DESDE EL 0
		//SI NO DAMOS UN VALOR AL ARRAY, EL DEFAULT VA A SER 0
		//NOMBRO/      DIGO CUANTOS ESPACIOS
		int[] edades = new int[5];
		edades[2] = 30;
		
		System.out.println(edades[2]);
		System.out.println(edades[0]);
		
		int tamanoArray = edades.length;
		System.out.println(tamanoArray);
		
		for (int i = 0; i < tamanoArray; i++) {
			System.out.println(edades[i]);
		}
		
	}
}
