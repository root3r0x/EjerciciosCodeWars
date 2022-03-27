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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author ledes
 *
 */
public class StringUtilsTest {

	  @Test
	  public void fixedTests() {
	    assertEquals("HELLO WORLD", StringUtils.toAlternativeString("hello world"));
	    assertEquals("hello world", StringUtils.toAlternativeString("HELLO WORLD"));
	    assertEquals("HELLO world", StringUtils.toAlternativeString("hello WORLD"));
	    assertEquals("hEllO wOrld", StringUtils.toAlternativeString("HeLLo WoRLD"));
	    assertEquals("Hello World", StringUtils.toAlternativeString(StringUtils.toAlternativeString("Hello World")));
	    assertEquals("12345", StringUtils.toAlternativeString("12345"));
	    assertEquals("1A2B3C4D5E", StringUtils.toAlternativeString("1a2b3c4d5e"));
	    assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", StringUtils.toAlternativeString("StringUtils.toAlternatingCase"));
	  }
	  
	  @Test
	  public void kataTitleTests() {
	    assertEquals("ALTerNAtiNG CaSe", StringUtils.toAlternativeString("altERnaTIng cAsE"));
	    assertEquals("altERnaTIng cAsE", StringUtils.toAlternativeString("ALTerNAtiNG CaSe"));
	    assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", StringUtils.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
	    assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", StringUtils.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
	  }
}
