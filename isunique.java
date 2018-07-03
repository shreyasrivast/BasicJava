import java.io.*;
public class isunique
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
        boolean uniqueString=true;
        for(int i=0;i<256;i++)
        {
        	if(count[i]>1)
        	{
        		uniqueString=false;
        		break;
        	}
        }
        if(uniqueString)
        	System.out.println("unique");
        else
        	System.out.println("not a unique");
    }
}
