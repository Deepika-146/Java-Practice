package Practice;

public class TwoSum {

	public static void main(String[] args) {
	int a[]= {3,6,9,4,5};
	int target=9;
	for (int i=0; i<a.length;i++)
	{
		for (int j=1; j<a.length; j++) 
		{
		if(a[i]+a[j]==target)	
		{
			System.out.println(a[i]+" "+a[j]);
		}
		
		}
	}
	}

}
