package Practice;

import java.util.Scanner;

class Mark{
	String name;
	int rollno;
	int mark;
Mark(String name, int rollno, int mark){
	this.name=name;
	this.rollno=rollno;
	this.mark=mark;
}

}

public class Students_Mark_Finder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Name");
		String stuname=sc.next();
		System.out.println("rollno");
		int sturollno=sc.nextInt();
		boolean found=true;
		Mark[] student= { 
				new Mark("Deepika", 01, 97),
				new Mark("Brindha", 02, 98)
		};
		
		for(int i=0;i<student.length;i++) {
			if(stuname.equalsIgnoreCase(student[i].name)|| sturollno==student[i].rollno) {
				System.out.println(student[i].mark);
				break;
			}
			else
			{
				System.out.println("Student not found...");
			}
	}

}}
