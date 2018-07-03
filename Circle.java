import java.util.Scanner;
import java.util.*;
public class Circle
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.println("enter the radius of the circle:");
      double r= in.nextDouble();
      final double pi=3.14159;
      double p=2*r*pi;
      System.out.println("Parameter:"+p);
      
    }
}