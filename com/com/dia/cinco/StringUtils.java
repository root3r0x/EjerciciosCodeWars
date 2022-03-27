/**
 * altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 * altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 * 
 * Define String.prototype.toAlternatingCase (or a similar function/method
 *  such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your 
 *  selected language; see the initial solution for details) such that each 
 *  lowercase letter becomes uppercase and each uppercase letter becomes lowercase. 
 *  For example:
 *  
 *  StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
 *  StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
 *  StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
 *  StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
 */

package com.dia.cinco;

/**
 * @author ledes
 *
 */
/**
		for(int i =0; i>string.length(); i++)	{
				
			if(string.charAt(i)==Character.toUpperCase(string.charAt(i))) 
			{
				string.replace(string.charAt(i), Character.toLowerCase(string.charAt(i)));
				i++;
			}
			if(string.charAt(i)==Character.toLowerCase(string.charAt(i))) {
				string.replace(string.charAt(i), Character.toUpperCase(string.charAt(i)));
				i++;
			}
			
			//val1>val2 ? true : false;
			char upper = string.charAt(i);
			char lower = Character.toLowerCase(string.charAt(i));
			
			//upper=='o' ? string.replace(upper, lower) : string.replace(upper, lower);
			
			
		} **/
public class StringUtils {
	
	public static String toAlternativeString(String string) {
		
		// your code here!
		String cadena = string;
		
		for(char c: cadena.toCharArray()) {
			
		}
		
		return cadena;
	  }
	public static void main(String[] args) {
		char a = 'b', b = 'b';
		boolean  c = a==b;
		
		System.out.println( " Valor: " + c );
	}
}
