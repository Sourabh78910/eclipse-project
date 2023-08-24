package inheritance;
class parent
{
	public void job()
	{
		System.out.println("jobdetails");
	}
}

class child extends parent
{
	public void salary()
	{
		System.out.println("salary details");
	}
}

public class singlelevel {

	public static void main(String[] args) {
		child c=new child();
		c.salary();
		c.job();
	}

}
