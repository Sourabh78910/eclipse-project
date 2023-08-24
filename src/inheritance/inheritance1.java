package inheritance;
class member
{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	public void printdetails()
	{
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("address="+address);
System.out.println("phoneno="+phoneno);
System.out.println("salary="+salary);
	}
}
class employee extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}



public class inheritance1 {
	

	public static void main(String[] args) {
		employee emp1=new employee();
		emp1.name="sanu";
		emp1.age=22;
		emp1.address="s villa,chicago";
		emp1.phoneno=9496969696l;
		emp1.salary=50000;
		emp1.printdetails();
		System.out.println(emp1.specialization="developer");
		manager m1=new manager();
		m1.name="anu";
		m1.age=29;
		m1.address="m villa,texas";
		m1.phoneno=9496979876l;
		m1.salary=60000;
		m1.printdetails();
		System.out.println(m1.department="hr");
		
		
	}

}
