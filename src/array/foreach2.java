package array;

import java.util.Scanner;

public class foreach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[][]a=new int[3][2];
System.out.println("enter the numbers");
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
System.out.println("entered numbers");
for(int[]v:a)
{
	for(int ref:v)
	{
		System.out.print(ref+" ");
	}
	System.out.println();
}
	}

}
