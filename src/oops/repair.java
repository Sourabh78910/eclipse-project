package oops;
class vehicle
{
	public void drive()
	{
		System.out.println("repairing a car");
	}
}
class car extends vehicle
{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}
	
	
}

public class repair {

	public static void main(String[] args) {
		car c=new car();
		c.drive();

	}

}
