package oops;
class parent
{
	public void name()
	{
		System.out.println("manoj");
	}
	public void job()
	{
		System.out.println("doctor");
	}
}
class child extends parent
{

	@Override
	public void name() {
		System.out.println("abhi");
		super.name();
	}

	@Override
	public void job() {
		System.out.println("teacher");
		super.job();
	}
	
		
	}
	

public class overriding {

	public static void main(String[] args) {
	child c=new child();
	c.name();
		c.job();

	}

}
