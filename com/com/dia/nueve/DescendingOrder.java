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

/**
 * @author ledes
 *
 */

public class DescendingOrder {
	
	public static int sortDesc(final int num) {
	    //Your code
		return num;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//variables
		int numeroOriginal = 345982;
		
		int multiplicador = 1, 	resultado = 0, contador = 0;
		
		//Declaramos el  arreglo sin inicializar.
		int[] numeros = null;
		
		//Revisamos que se pueda dividir entre si mismo.
		resultado = numeroOriginal / multiplicador;
		System.out.println("Noriginal: [" + resultado + "] \n");
		
		//Obtenemos el divisor.
		while (resultado>0) {	
			
			//Hasta que se realicen todas las diviciones posibles.
			multiplicador *= 10;
			
			//Primer condicion
			resultado = numeroOriginal / multiplicador;	
			
			contador++;
		} 
		
		if(contador!=0) {
			//Inicializamos el arreglo de numeros.
			numeros = new int[contador];
			
			//Obtenemos cada cifra.
			for(int i = 0; i<numeros.length;i++){	
				
				//Disminuimos una cifra.
				multiplicador = multiplicador/10; 
				
				//Obtenemos el resultado.
				numeros[i] = numeroOriginal/multiplicador; 
				
				//Obtenemos el numero de la cifra..
				numeroOriginal = numeroOriginal - (multiplicador * numeros[i]);
			}
		}
		
		//Validamos la longitud del array.
		if(numeros.length==1) {
			resultado = numeros[0];
		}
		
		//Imprimimos el array.
		for(int i = 0; i<contador;i++)  {
			
			System.out.println("i->["+ i + "]= " + numeros[i]);
			
			for(int x =0; x<contador; x++) {
				//System.out.println("[" + x + "]" + " [" + numeros[i] + "]");
				
				if(numeros[i]>numeros[x]) {
					
					System.out.println("[" + numeros[x] + "]" + " [" + numeros[i] + "] si");
				}
				else {
					numeros[x] = numeros[x];
					System.out.println("[" + numeros[x] + "]" + " [" + numeros[i] + "] no");
				}
			}
		} 
	}
}

