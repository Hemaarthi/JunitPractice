package sampletest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();
	
	 @Test
	    public void testAdd() {
	        assertEquals(5, calc.add(2, 3));  // 2 + 3 = 5
	    }

	    @Test
	    public void testSub() {
	        assertEquals(-1, calc.sub(2, 3)); 
	    }// 2 - 3 = -1
	    @Test
	    public void testmul()
	    {
	    	assertEquals(2,calc.mul(1, 2));
	    }
	    @Test
	    public void testdiv()
	    {
	    	assertEquals(3,calc.div(6, 2));
	    }
	    @Test(expected = IllegalArgumentException.class)
	    public void divisorzero()
	    {
	    	calc.div(3,0);
	    }
	 

}
