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

public class StringUtils {
	
	public static String toAlternativeString(String string) {
		
		String string2 = new String();		
		for(int i =0;i<string.length();i++) {
		
			char oldchar = string.charAt(i);
			char newchar = ' ';
			
			if (Character.isUpperCase(string.charAt(i))) {
				newchar = Character.toLowerCase(oldchar);
				string2 += newchar;		
			}else {
				newchar = Character.toUpperCase(oldchar);
				string2 += newchar;	
			}
		}
		return string2;
	  }
}
