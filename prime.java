import java.io.*;
public class prime
{
	public static void main(String[] args)throws IOException
	{
        int c=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the number :");
         int a=Integer.parseInt(br.readLine());
      for(int i=1;i<=a;i++)
      {
         if(a%i==0)
         	c++;
      }
        
      
      if(c==2)
      	System.out.println("prime no. ");
      else
      	System.out.println("not a prime no.");
	}
}