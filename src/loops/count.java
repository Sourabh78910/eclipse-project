package loops;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int c=0;
while(a>0)
{
	a=a/10;
	c++;
}
System.out.println("count="+c);
	}

}
