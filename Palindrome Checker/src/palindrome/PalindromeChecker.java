package palindrome;

public class PalindromeChecker 
{
	static boolean isPalindrome(String s)
	{
		return s.length() < 2 
			|| s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1, s.length()-1));
	}
	
//	static boolean oldIsPalindrome(String s)
//	{
//		return s.length() < 2 || halvesMatching(s);
//	}
//	
//	static private boolean halvesMatching(String s)
//	{
//		return getFirstPart(s).equals(getSecondPart(s));
//	}
//	
//	private static String getFirstPart(String s)
//	{
//		return s.substring(0, s.length()/2);
//	}
//	
//	private static String getSecondPart(String s)
//	{
//		return reverseString(s.substring((s.length()+1)/2));
//	}
//	
//	static private String reverseString(String s)
//	{
//		final StringBuilder reversed = new StringBuilder();
//		for (int i = s.length()-1; i>=0; i--) {
//			reversed.append(s.charAt(i));
//		}
//		return reversed.toString();
//	}

}
