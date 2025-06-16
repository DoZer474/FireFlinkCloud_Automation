package Logics;

public class countVowelsAndConsonants {
	public static int countV=0;
	public static int countC=0;
	public static void main(String[] args) {
String input ="Sanjay and Sanjay";
countVC01(input);
System.out.println(countV + " "+ countC);
	}
	public static int countVC01(String str)
	{
		char[] ch=str.toLowerCase().toCharArray();

		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				countV++;
			}
			else
			{
				countC++;
			}
		}
		return countV;
	}

}
