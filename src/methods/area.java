package methods;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
area ob=new area();
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius");
int r=sc.nextInt();
System.out.println("enter the side");
int a=sc.nextInt();

ob.rectangle();
ob.triangle();
ob.circle(r);
ob.square(a);
	}
	public int rectangle()
	{
		int l=4,b=3;
		int a=l*b;
		System.out.println(a);
		return a;
	}
	public void triangle()
	{
		int b=3,h=4;
		double a=0.5*b*h;
		System.out.println(a);
	}
	public double circle(int r)
	{
		double a=3.14*r*r;
		System.out.println(a);
		return a;
	}
	public void square(int a)
	{
		int area=a*a;
		System.out.println(area);
		
	}

}
