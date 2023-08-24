package array;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int []a=new int[size];
System.out.println("enter the numbers");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("entered numbers");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}



	}

}
