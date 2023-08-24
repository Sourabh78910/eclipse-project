package encapsulation;
class emp
{
	private String empname;
	private String empdesignation;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	
}

public class Encaps1 {

	public static void main(String[] args) {
		emp ob=new emp();
		ob.setEmpname("Sourabh");
		System.out.println(ob.getEmpname());
		ob.setEmpdesignation("tester");
		System.out.println(ob.getEmpdesignation());
		ob.setEmpname("kannan");
		System.out.println(ob.getEmpname());
	
	

	}

}
