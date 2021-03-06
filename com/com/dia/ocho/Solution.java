/**
 * Area or Perimeter.
 * 
 * You are given the length and width of a 4-sided polygon. 
 * The polygon can either be a rectangle or a square.
 * If it is a square, return its area. If it is a rectangle, return its perimeter.
 * 
 * area_or_perimeter(6, 10) --> 32 
 * area_or_perimeter(3, 3) --> 9
 * 
 * Note: for the purposes of this kata you will assume that it is a square if its
 * length and width are equal, otherwise it is a rectangle.
 */
package com.dia.ocho;

/**
 * @author ledes
 *
 */
public class Solution {
	
	public static int areaOrPerimeter (int l, int w) {
	     
		//if l==w it's Square [getArea] (LxL) else it's Rectangle [getPerimeter](L+L+L+L).
		return l==w ? (l*l) : (l*2) + (w*2);
	}
}
