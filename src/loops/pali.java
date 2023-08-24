package loops;

import java.util.Scanner;

public class pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int rev=0,r;
while(n>0)
{
	r=n%10;
	rev=rev*10+r;
	n=n/10;
	
}
System.out.println("reverse="+rev);
if(temp==rev)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
	}
	

}

