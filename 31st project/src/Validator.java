
import java.util.Scanner;

public class Validator {

	public static int getInt(Scanner sc, String prompt)
	{
		int i = 0;
		boolean isValid = false;
		while(isValid == false)
		{
			System.out.print(prompt);
			if(sc.hasNextInt())
			{
				i = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("Invalid integer value. Try again");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static double getDouble(Scanner sc, String prompt)
	{
		double i = 0;
		boolean isValid = false;
		while(isValid == false)
		{
			System.out.print(prompt);
			if(sc.hasNextDouble())
			{
				i = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("Invalid double value. Try again ");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static String getString(Scanner sc, String prompt)
	{
		String i = "";
		boolean isValid = false;
		while(isValid == false)
		{
			System.out.print(prompt);
			if(sc.hasNext())
			{
				i = sc.next();
				isValid = true;
			}
			else
			{
				System.out.println("Invalid String value. Try again ");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static int getyear(Scanner sc, String prompt)
	{
		int i = getInt(sc, prompt);
		
		while(i > 2015 || i<0)
		{
			System.out.println("Invalid year. Try again ");
			sc.nextInt();
		}
		
		return i;
	}
	
	public static int getmonth(Scanner sc, String prompt)
	{
		int i = getInt(sc, prompt);
		
		while(i > 12 || i<0)
		{
			System.out.println("Invalid month. Try again ");
			sc.nextInt();
		}
		
		return i;
	}
	
	public static int getday(Scanner sc, String prompt)
	{
		int i = getInt(sc, prompt);
		
		while(i > 31 || i<0)
		{
			System.out.println("Invalid day. Try again ");
			sc.nextInt();
		}
		
		return i;
	}
}
