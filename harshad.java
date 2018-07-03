import java.util.Scanner;
import java.util.*;
class harshad
{
	public static void main(String[] args)
	{
		int n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter no. of digits:");
	n=in.nextInt();
	 int count=0; int i=n;
		while(i>0)
		{
            int d=i%10;
            count=count+d;
            i=i/10;
		}

	if(n%count==0)
		System.out.println("harshad no.");
	else
		System.out.println("no harshad");
}
}

