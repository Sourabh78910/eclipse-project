package inter;

import java.util.Scanner;

interface bankdetails
{
	public void accountdetails();
	public void withdraw();
	public void balance();
	public void deposit();
}
class Sbi implements bankdetails
{
	String accno;
	String name;
	String acctype;
	
int balance=10000;

	@Override
	public void accountdetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter account no");
	 String accno=sc.next();
	 System.out.println("Enter name:");
	 String name=sc.next();
	 System.out.println("Enter account type");
	 String acctype=sc.next();
	 System.out.println(accno+","+name+","+acctype);
	 
	 
	 
	
	
	
		
	}

	@Override
	public void balance() {
	
		System.out.println("balance="+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("enter the amount to deposit");
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
balance=d+balance;
	if(d>0)
	{
	System.out.println("balance amount="+balance);
	}
	else
	{
		System.out.println("invalid amount");
	}

		
	}

	@Override
	public void withdraw() {
		System.out.println("enter the amount to withdraw");
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		if(balance>=w)
		{
			balance=balance-w;
			System.out.println("balance after withdrawal="+balance);
		}
		else
		{
			System.out.println("your balance is less than withdrawal amount");
		}
		
		
	}
	
}

public class Bank {

	public static void main(String[] args) {
		Sbi sb=new Sbi();
		sb.accountdetails();
		sb.balance();
		sb.deposit();
		sb.withdraw();

	}

}
