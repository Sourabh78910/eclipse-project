package array;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a=new int[3][2];
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");

	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(a[i][j]+" ");
		}
	
	System.out.println();
}}
	}


