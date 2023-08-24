package loops;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int temp=a;
int r,sum=0;
while(a>0)
{
	r=a%10;
	sum=sum+r*r*r;
	a=a/10;
	
}
if(temp==sum)
{
	System.out.println("armstrong");
}
else
{
	System.out.println("not armstrong");
}

	}

}
