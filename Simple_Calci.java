package dailytask;

import java.util.Scanner;

public class Simple_Calci {
	public static int add(int a, int b)
	{
		int add=a+b;
		return add;
	}
	public static int sub(int a, int b)
	{
		int sub=a-b;
		return sub;
	}
	public static int mul(int a, int b)
	{
		int mul=a*b;
		return mul;
	}
	public static int div(int a, int b)
	{
		int div=a/b;
		return div;
	}

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter value of a: ");
		 int a=sc.nextInt();
		 System.out.println("Enter value of b: ");
		 int b=sc.nextInt();
		 System.out.println("Addition of a&b is: "+add(a,b));
		 System.out.println("Subtraction of a&b is: "+sub(a,b));
		 System.out.println("Multiplication of a&b is: "+mul(a,b));
		 System.out.println("Division of a&b is: "+div(a,b));
		 sc.close();
	}
}
