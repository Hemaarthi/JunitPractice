package Palindrome;

public class Palindrome {
	public String reversed(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		return res;
	}
	public boolean palindrome(String str)
	{
		if(str==null)
		{
			throw new IllegalArgumentException("Input cannot be null");
		}
		String lowercase=str.toLowerCase();
		String res=reversed(lowercase);
		if(str.equals(res))
		{
			return true;
		}
		return false;
		
	}
}
