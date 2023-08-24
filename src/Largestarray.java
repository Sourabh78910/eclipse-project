import java.util.Scanner;

public class Largestarray {

	public static void main(String[] args) {
	int temp=0;
	System.out.println("enter the size");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	System.out.println("enter the numbers");
	int[]a=new int[size];
	for(int i=0;i<size;i++)
	{
	
		
			a[i]=sc.nextInt();
			if(a[i]>temp)
				temp=a[i];
			
		}
	System.out.println("large no="+temp);
	}
	
	
	
	
		
	

	}


