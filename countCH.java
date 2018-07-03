import java.io.*;
public class countCH
{

	public static void main(String[] args)throws IOException
	{
        
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String s=br.readLine();
        int[] count=new int[256];
        for(int i=0;i<s.length();i++)
        {

         char ch=s.charAt(i);
         count[ch]++;
        }
        for(int i=0;i<256;i++)
                System.out.println(count[i]);
}
}