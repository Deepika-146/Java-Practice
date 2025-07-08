package Day5;

public class CountNumEvenOdd {
public static void main (String[] args)
{
	int num=12345;
	int even=0;
	int odd=0;
	while (num!=0)
	{
		//int a=num/10;
	if(num%2==0)
	{
		even ++;
	}
	else
	{
		odd++;
	}
	num=num/10;
	}
	System.out.println("Even count:"+even);
	System.out.println("Odd count:"+odd);

}
}
