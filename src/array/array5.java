package array;

import java.util.Scanner;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][]a=new String[3][2];
Scanner sc=new Scanner(System.in);
System.out.println("ënter the names");
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
	 a[i][j]=sc.next();
	}
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	}

}
