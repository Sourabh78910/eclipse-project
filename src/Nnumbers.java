import java.util.Scanner;

public class Nnumbers {

	public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		System.out.println(i);
		sum+=i;
	}
		System.out.println("sum="+sum);


	}

}
