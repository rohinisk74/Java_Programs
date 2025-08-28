package dailytask;
import java.util.Scanner;

public class Postive_negative {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" is a positive number");	
		}
		System.out.println("Entered num is zero");
		sc.close();	
	}
}
