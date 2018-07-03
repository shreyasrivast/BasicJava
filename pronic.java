import java.util.Scanner;
import java.util.*;
class pronic
{
	public static void main(String[] args)
	{
		int n,p;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter no. of digits:");
	n=in.nextInt();
	for(int i=0;i<=n;i++)
	{
		p=i*(i+1);
		System.out.print(p+" ");
	}
}
}
