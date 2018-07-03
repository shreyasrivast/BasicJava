import java.util.Scanner;
import java.util.*;
class odd
{
	public static void main(String[] args)
	{
		int n; int sum=0, count=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter no. of digits:");
	n=in.nextInt();
	int a[] =new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			sum=sum+a[i];
			count=count+1;
		}
	}
	System.out.println("Sum: "+sum);
	System.out.println("Count: "+count);
}
}