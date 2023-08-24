package inheritance;
class animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}

class dog extends animal
{
	public void dogbarking()
	{
		System.out.println("dogbarking");
	}
}
class babydog extends dog
{
	public void babydogdetails()
	{
		System.out.println("babydogdetails");
		
	}
}
public class multilevel {

	public static void main(String[] args) {
		babydog bg=new babydog();
		bg.babydogdetails();
		bg.dogbarking();
		bg.animalfood();
	}

}
