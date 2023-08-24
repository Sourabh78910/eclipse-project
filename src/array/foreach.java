package array;

import java.util.Scanner;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[]a=new int[4];
System.out.println("enter the numbers");
for(int i=0;i<4;i++)
{
	
	
		a[i]=sc.nextInt();
	}
System.out.println("entered numbers");
for(int ref:a)
{
	System.out.println(ref);
}
	}

}
