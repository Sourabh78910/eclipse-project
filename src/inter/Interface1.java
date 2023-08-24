package inter;
interface car
{
	public void speedlimit();
	public void mileage();
	
	
}
interface carmodification
{
	public void modify();
}
class bmw implements car,carmodification
{

	@Override
	public void speedlimit() {
		System.out.println("bmw speedlimit");
		
	}

	@Override
	public void mileage() {
		System.out.println("bmw milage");
		
	}

	@Override
	public void modify() {
		System.out.println("bmw modification");
		
	}
	
}
class kia implements car,carmodification
{

	@Override
	public void speedlimit() {
		System.out.println("kia speedlimit");
		
	}

	@Override
	public void mileage() {
		System.out.println("kia mileage");		
	}

	@Override
	public void modify() {
		System.out.println("kia modification");
		
	}
	
}

public class Interface1 {

	public static void main(String[] args) {
		kia k=new kia();
		k.speedlimit();
		k.mileage();
		k.modify();
		bmw b=new bmw();
		b.speedlimit();
		b.mileage();
		b.modify();
		

	}

}
