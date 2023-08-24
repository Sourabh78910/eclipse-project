package loops;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f=1;
for(int i=1;i<=n;i++)
{
	f=f*i; //1*1=1 1*2=2 2*3=6 6*4=24
}
System.out.println("factorial="+f);

	}

}
