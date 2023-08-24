package methods;

public class methodcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodcalc ob=new methodcalc();
System.out.println(ob.add());
ob.sub(30, 20);
ob.mul(20, 10);
ob.div();
	}
	//method with returntype and without parameter
public int add()
{
	int a=10,b=20;
	int c=a+b;
	return c;
}
//method without returntype
public void sub(int a,int b)
{
	int c=a-b;
	System.out.println(c);
	
}
public int mul(int a,int b)
{
	int c=a*b;
	System.out.println(c);
	return(c);
			
}
public void div()
{
	double d1=30,d2=7;
	double d3=d1/d2;
	System.out.println(d3);
}
}
