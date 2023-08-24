package adddo;

import java.util.Scanner;

public class dosum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		char response;
		do
		{
			System.out.println("Enter two numbers");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 int c=a+b;
			 System.out.println("sum of two numbers="+c);
			 System.out.println("do you want to continue?y/n");
			 response=sc.next().charAt(0);
			 
			 
		}
		while(response=='y'||response=='Y');
		

	}

}
