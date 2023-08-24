package abstraction;
abstract class car
{
	abstract public void speedlimit();
	public void acceleration()
	{
		System.out.println("acceleration");
	}
	abstract public void mileage();
}
class kia extends car
{

	@Override
	public void speedlimit() {
		System.out.println("kia speedlimit");
		
	}

	@Override
	public void mileage() {
		System.out.println("kia mileage");
		
	}
	
}
class bmw extends car
{

	
	@Override
	public void speedlimit() {
		System.out.println("bmw speedlimit");
		
	}

	@Override
	public void mileage() {
		System.out.println("bmw mileage");
		
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
	kia ob=new kia();
	ob.speedlimit();
	ob.mileage();
	bmw bm=new bmw();
	bm.speedlimit();
	bm.mileage();
	bm.acceleration();
	

	}

}
