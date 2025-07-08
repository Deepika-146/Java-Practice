package Day6Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		int a[]= {10,11,12,13};
		
		for(int i=0; i<a.length; i++)
		{
			boolean prime=true;
			if(a[i]<2)
			{
				prime=false;
			}
		
		for(int n=2; n<a[i]; n++)
		{
			if(a[i]%n==0)
			{
				prime=false;
				break;
			}
			}
		
		if (prime)
		{
			System.out.println(a[i]+" "+"is prime");
		}
		else
		{
			System.out.println(a[i]+" "+"is not prime");
		}
	}
		/*int num=7;boolean prime=true;
		for(int n=2; n<num; n++)
		{
			
		if(num%n==0)
		{
			prime=false;
			break;
		}}
		if (prime) {
		System.out.println(num +"is prime");
		}
		else
		{
			System.out.println(num +"not prime");
		}*/

}}
