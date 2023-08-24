package inheritance;
class animal1
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}
class tiger extends animal
{
	public void tigerdet()
	{
		System.out.println("tigerdetails");
	}
}
class elephant extends animal
{
	public void elephantdet()
	{
		System.out.println("elephantdetails");
	}
}

public class hierarchial {

	public static void main(String[] args) {
		tiger t=new tiger();
		elephant e=new elephant();
		t.animalfood();
		t.tigerdet();
		e.animalfood();
		e.elephantdet();
	}

}
