package array;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many names you want to store:");
int size = sc.nextInt();
String[] a=new String[size];
System.out.println("enter the names");
for(int i=0;i<size;i++)
{
	a[i]=sc.next();
}
System.out.println("entered names");
for(int i=0;i<size;i++)
{
	System.out.println(a[i]);
}
	}

}
