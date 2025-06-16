package Logics;

public class checkForPalindrome {

	public static void main(String[] args) {
String input="Sanjay  yajnaS";
System.out.println(palindrome01(input));
System.out.println(palindrome02(input));


	}
////////////////////////////////////////////////////////////////////////	
	public static String palindrome01(String str)
	{
		String reversed= new StringBuilder(str).reverse().toString();
		if(str.equals(reversed)) {
			return "is palindrome";
		}
		else
		{
			return "is not palindrome";
		}
	}
////////////////////////////////////////////////////////////////////////
	public static String palindrome02(String str)
	{
		char[] ch = str.toCharArray();
		String reversed="";
		for(int i=ch.length-1;i>=0;i--)
		{
			reversed += ch[i];
		}
		if(str.equals(reversed))
		{
			return "is palindrome";
		}
		else
		{
			return "is not palindrome";
		}
	}
////////////////////////////////////////////////////////////////////////	

}
