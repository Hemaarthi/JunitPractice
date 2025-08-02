package Palindrome;

import static org.junit.Assert.*;

import org.junit.Test;
public class PalindromeTest {
	Palindrome p=new Palindrome();
	@Test
	public void test() {
		assertTrue(p.palindrome("madam"));
	}
	@Test
	public void testfail()
	{
		assertFalse(p.palindrome("hema"));
	}
	@Test(expected =IllegalArgumentException.class)
	public void testnull()
	{
		p.palindrome(null);
	}
}
