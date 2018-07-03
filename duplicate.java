import java.io.*;
class duplicate
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s = br.readLine();
	  String p=""; char c;
	  for(int i=0;i<s.length();i++)
	  {
	  	c=s.charAt(i);
	  	if(c!=' ')
	  		p=p + c;
	  	s=s.replace(c,' ');
        
	  }
	  System.out.println(p);
	}
}