package constructor;

public class emp {
	String empname;
	String empdesignation;
	int empid;
	
public emp(String empname,String empdesignation,int empid)
{
	this.empname=empname;
	this.empdesignation=empdesignation;
	this.empid=empid;
	
}
public void display()
{
	System.out.println("empname="+empname);
	System.out.println("empdesignation="+empdesignation);
	System.out.println("empid="+empid);
}
	public static void main(String[] args) {
		emp emp1=new emp("arya","developer",101);
		emp emp2=new emp("anand","tester",102);

		emp1.display();
		emp2.display();
	}

}
