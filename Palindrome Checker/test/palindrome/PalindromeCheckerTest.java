package palindrome;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest 
{
	@Test
	public void emptyStringIsPalindrome()
	{
		assertTrue(PalindromeChecker.isPalindrome(""));
	}
	
	@Test
	public void abIsNotAPalindrome()
	{
		assertFalse(PalindromeChecker.isPalindrome("ab"));
	}
	
	@Test
	public void oneCharacterIsaPalindrome()
	{
		assertTrue(PalindromeChecker.isPalindrome("x"));
	}

	@Test
	public void aaIsaPalindrome()
	{
		assertTrue(PalindromeChecker.isPalindrome("aa"));
	}
	
	@Test
	public void axxaIsaPalindrome()
	{
		assertTrue(PalindromeChecker.isPalindrome("axxa"));
	}	
	
	@Test
	public void abcxcbaIsaPalindrome()
	{
		assertTrue(PalindromeChecker.isPalindrome("abcxcba"));
	}
	
	@Test
	public void abxabIsNotaPalindrome()
	{
		assertFalse(PalindromeChecker.isPalindrome("abxab"));
	}
}
