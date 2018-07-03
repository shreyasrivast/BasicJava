import java.io.*;
public class factorial
{
	public static void main(String[] args)throws IOException
	{
        
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 int t=Integer.parseInt(br.readLine());
		 int[] a=new int[t]; int fact,j;
		 if(t>=1 && t<=100)
		 {
		 for(int i=0;i<a.length;i++)
		 {
		 	a[i]=Integer.parseInt(br.readLine());
		 }  
		 for(int i=0;i<a.length;i++)
		 { 
		 	if(a[i]>=1 && a[i]<=100)
		 	{
		 		for(j=1,fact=1;j<=a[i];j++)
		 		{
		 			fact=fact*j;
		 		}
		 		System.out.println(fact);
		 	}	
		 	
		 }
		}
	}
}
