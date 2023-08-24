interface basicanimal
{
	public void eat();
	public void sleep();
}
class monkey
{
	public void jump()
	{
		System.out.println("monkeyjump ");
	}
	public void bite()
	{
		System.out.println("monkeybite");
	}
}
class human extends monkey implements basicanimal  
{
	public void speak()
	{
		System.out.println("human speaking");
	}

	@Override
	public void eat() {
		System.out.println("humaneats");
		
	}

	@Override
	public void sleep() {
		System.out.println("humansleep");
		
	}
}
public class Humanmonkey {

	public static void main(String[] args) {
		human h=new human();
		h.eat();
		h.sleep();
		h.jump();
		h.speak();
		h.bite();

	}

}
