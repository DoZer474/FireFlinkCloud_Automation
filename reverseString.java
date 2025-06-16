package Logics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseString {

	public static void main(String[] args) {
String input ="Sanjay and time dont match";
System.out.println(input + " the reverse of the the string is "+ revString01(input));
System.out.println(input + " the reverse of the the string is "+ revString02(input));
System.out.println(input + " the reverse of the the string is "+ revString03(input));
System.out.println(input + " the reverse of the the string is "+ revString04(input));
System.out.println(input + " the reverse of the the string is "+ revString05(input));

	}
	
///////////////////////////////////////////////////////////////////////////	
public static String revString01(String str) {
	char[] ch = str.toCharArray();
	int j=ch.length-1;
	for(int i=0;i<j;i++) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		j--;
		
	}
	
	return new String(ch);
}
///////////////////////////////////////////////////////////////////////////
public static String revString02(String str) 
{
	String reverse=new StringBuilder(str).reverse().toString();
	return reverse;
}
///////////////////////////////////////////////////////////////////////////
public static String revString03(String str)
{
	char[] ch=str.toCharArray();
    String reversed = "";
    for (int i = ch.length - 1; i >= 0; i--) 
    {
        reversed += ch[i];
    }
    return reversed;
}
///////////////////////////////////////////////////////////////////////////
public static String revString04(String str)
{
	String reversed="";
	for(int i=str.length()-1;i>=0;i--) {
		reversed += str.charAt(i);
	}
	return reversed;
}
///////////////////////////////////////////////////////////////////////////
public static StringBuilder revString05(String str)
{
    List<Character> list = new ArrayList<>();
    for (char c : str.toCharArray()) list.add(c);
    Collections.reverse(list);
    
    StringBuilder reversed = new StringBuilder();
    for (char c : list) reversed.append(c);
    return reversed;
}
///////////////////////////////////////////////////////////////////////////
}
