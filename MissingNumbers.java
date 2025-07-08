package Day6Arrays;

public class MissingNumbers {
public static void main (String[] args)
{
	//Array should have any duplicates and they should be in range, no need sorted order
	int a[]= {4,6,5,8,9,10};
	int sum1=0;
	
	for(int i=0; i<a.length; i++)
	{
		sum1=sum1+a[i];
	}
	int sum2=0;
	for(int i=4; i<=10; i++)
	{
		sum2=sum2+i;
	}
	int missNum=sum2-sum1;
	System.out.println(missNum);
}
}
