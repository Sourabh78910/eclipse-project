package interfacepgm;
interface basicresume
{
	public void personaldetails();
	public void experience();
	public void qualification();
	public void skills();
}
class resume implements basicresume
{

	@Override
	public void personaldetails() {
		System.out.println("Name=Sourabh.S");
		System.out.println("phno=9999999999");
		System.out.println("email=sourabhkylm@gmail.com");
	}

	@Override
	public void experience() {
		
		
	}

	@Override
	public void qualification() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skills() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}	
public class Resume {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
