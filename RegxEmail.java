package regx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegxEmail 
{
	public static void main(String[] args)
	{
	    Scanner c=new Scanner(System.in);
	    System.out.println("Enter pincode");
	    String n=c.nextLine();
	    System.out.println("String is"+n);
		System.out.println(Pattern.matches("^[_A-Za-z0-9-\\+]+@"
				+"([A-Za-z]{2,})$",n));
		c.close();
	}   
}
