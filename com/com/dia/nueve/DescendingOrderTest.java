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

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {
	@Test
	public void test_01() {
		assertEquals(0, DescendingOrder.sortDesc(0));
    }    

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }
    
    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}