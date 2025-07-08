package Day3;

public class Swapping {
public static void main (String[] agrs)
{
	int a,b,c;
	a=10;
	b=20;
	System.out.println("Before Swapping:"+"" +a+" "+b);
	/*a=a+b;  //now a has new value 30
	b=a-b;  //now b has a value 10
	a=a-b;  //now a has new value 20
	System.out.println("After Swapping:"+" "+a+" "+b);*/
	/*c=a; //c value is 10
	a=b; //now a value is 20
	b=c; //now a value of b is 10*/
	a=a^b; // a holds both a and b XOR
	b=a^b; // b got 10
	a=a^b; // a got 20
	System.out.println("After Swapping:"+" "+a+" "+b);
	
}
}
