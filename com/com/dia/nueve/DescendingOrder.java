/**
 * Descending Order
 * 
 * Your task is to make a function that can take any non-negative 
 * integer as an argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 * 
 * Examples:
 * 
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */

package com.dia.nueve;

import java.util.ArrayList;

/**
 * @author ledes
 *
 */

public class DescendingOrder {
	
	public static int sortDesc(final int num) {
	    //Your code
		ArrayList<Integer> valores = new ArrayList<Integer>();
		int maxVal = 0, mulDivVal = 10, pushVal =1;
		
		return num;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variables
		int numeroOriginal = 3452;
		int multiplicador = 1, resultado = 0, contador = 0, acumulador=0;
		int[] numeros;
		
		resultado = numeroOriginal / multiplicador;
		System.out.println(".-Noriginal: [" + resultado + "].");
		System.out.println("");
		
		while (resultado>0) {	
			
			//hasta que se realicen todas las diviciones posibles.
			multiplicador *= 10;
			
			//Primer condicion
			resultado = numeroOriginal / multiplicador;	
			
			System.out.println("[w] Resultado: [" + resultado + "].");
			System.out.println("\t[m] =" + multiplicador);
			contador++;
		} 
		System.out.println("");
		
		if(contador!=0) {
			
			numeros = new int[contador];
			
			for(int i = 0; i<numeros.length;i++){	
				multiplicador = multiplicador/10;
				numeros[i] = numeroOriginal/multiplicador;
				System.out.println("No["+ i + "] : [" + numeros[i] + "].");
				
				numeroOriginal = numeroOriginal - (multiplicador* numeros[i]);
			}
		}
		System.out.println("\n {" + contador + "}");
	}
}

