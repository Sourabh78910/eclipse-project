package array;

import java.util.Scanner;

public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
int sum=0;
for(int i=0;i<4;i++)
{
	a[i]=sc.nextInt();
	sum=sum+a[i];
}
System.out.println("sum="+sum);
System.out.println("avg="+sum/4);
	

	
	
}



	}


