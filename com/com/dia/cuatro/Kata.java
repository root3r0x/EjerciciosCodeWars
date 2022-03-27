package com.dia.cuatro;
/**
 * Remove String Spaces.
 * Simple, remove the spaces from the string, then return the resultant string.
 */

/**
 * @author ledes
 *
 */
public class Kata {
	
	public static String noSpace(final String x) {
		
		String noSpacesSTNG = new String();
		
		for(int i =0; i<x.length(); i++)	{
        	if(x.charAt(i)!=' ')	{
        		noSpacesSTNG += x.charAt(i);
        	}
        }
		return noSpacesSTNG;
    }
}