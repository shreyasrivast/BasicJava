import java.io.*;
public class binary
{
	public static void main(String[] args)throws IOException
	{
        
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the binary string :");
         String s=br.readLine();
         int l=s.length();
         int[] arr=new int[l];
         for(int i = 0; i < l; i++) {
    arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
}

         	for(int j=0;j<arr.length;j++)
         		System.out.println(arr[j]);
     }
 }