package adddo;

import java.util.Scanner;

public class arraypos {

	public static void main(String[] args) {
		int pos=0,neg=0,zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		//int a=sc.nextInt();
		int[]ar=new int[6];
		for(int i=0;i<6;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			if(ar[i]==0)
			{
				zero++;
				
			}
			else if(ar[i]>0)
			{
				pos++;
			}
			else 
			{
				neg++;
			}
		}
			System.out.println("total number of positive numbers="+pos);
			System.out.println("total number of negative numbers="+neg);
			System.out.println("total no of zero="+zero);
		
		

	}

}
