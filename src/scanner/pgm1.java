package scanner;

import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter two number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter your choice +,-,*,/");
char c=sc.next().charAt(0);
switch(c)
{
case '+':System.out.println("a+b="+(a+b));
break;
case '-':System.out.println("a-b="+(a-b));
break;
case '*':System.out.println("a*b="+(a*b));
break;
case '/':if(b==0)
{
	System.out.println("not divisible");
}
	System.out.println("a/b="+(a/b));
	break;
default:System.out.println("invalid choice");

}
	}

}
