package oops;


public class overloading {

	public static void main(String[] args) {
		overloading ob=new overloading();
		ob.add();
		ob.add(20, 30);
		ob.add(20, 25.5);
		ob.add(25.5, 30);
		

	}
	public void add()
	{
		int a=20,b=10;
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}

}
