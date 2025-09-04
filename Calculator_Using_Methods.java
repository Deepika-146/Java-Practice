package Java;
class Cal{
	int a;
	int b;
	 void add(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	void subtract(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}
	void multiplication(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a*b);
	}
	void division(int a, int b)
	{
		this.a=a;
		this.b=b;
		 if (b == 0) {
	            System.out.println("Error: Division by zero not allowed!");
	        } else {
	            System.out.println("Division: " + (a / b));
	        }
	}
	
}

public class Calculator_Using_Methods {

	public static void main(String[] args) {
		
Cal calc=new Cal();
calc.add(10,20);
calc.subtract(3, 5);
calc.multiplication(8,9);
calc.division(28, 0);
	}

}
