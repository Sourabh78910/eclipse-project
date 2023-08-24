package methods;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the strng");
String s=sc.next();
vowels ob=new vowels();
ob.vowel(s);
	}
public void vowel(String s)
{
	int c=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			c++;
		}
	}
	System.out.println("count="+c);
	
	
}
}
