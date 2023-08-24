package string;

import java.util.Scanner;

public class stringpali {

	public static void main(String[] args) {
System.out.println("enter the string");		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.next();
String rev=" ";
for(int i=a.length()-1;i>=0;i--)
{
	rev=rev+a.charAt(i);
}
System.out.println(rev);
if(a.equals(rev))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
	


	}

}
