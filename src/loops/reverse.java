package loops;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int rev=0,r;
while(a>0)    //345>0  34>0  3>0
{
	r=a%10;   //345%10=5  34%10=4  3%10=3
	rev=rev*10+r;  //5   5*10+4=54  54*10+3=543
	a=a/10;  //34  3  0
}
System.out.println("reverse="+rev);
	}

}
