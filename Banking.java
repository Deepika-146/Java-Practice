package Practice;

import java.util.Scanner;

class Banking_Main {
	
String name;
int accno;
private double balance;


Banking_Main(String name, int accno, double balance)
{
	this.name=name;
	this.accno=accno;
	this.balance=balance;
}

   double m1() {
	{
	return balance;
	}
	
}

public class Banking{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		int accnum=sc.nextInt();
		System.out.println("Enter Account Holder Name:");
		String accname=sc.next();
		
		Banking_Main[] person= {
				new Banking_Main("Deepika", 101, 127653.45),
				new Banking_Main("Brindha",102, 134000.23),
				new Banking_Main("Sathish", 103, 124765.244),
				new Banking_Main("Palanisamy", 104, 154753.22),
				new Banking_Main("MuthuLakshmi", 105, 1445413.14)
		};
		boolean found=false;
		for (int i=0; i<person.length; i++) {
			if(accname.equalsIgnoreCase(person[i].name)  &&  accnum==person[i].accno) {
			found=true;	
			System.out.println(person[i].m1());
			//System.out.println(person[i].balance);
			break;
			}
		}
		if(!found) {
			System.out.println("Invalid...");
			found=false;
		}
		}
				                
		}