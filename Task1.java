package dailytask;
import java.util.Scanner;

public class Task1 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numeric string:");
			String str=sc.nextLine();
			byte b=Byte.parseByte(str);
			short s=Short.parseShort(str);
			int a= Integer.parseInt(str);
			float f=Float.parseFloat(str);
			double d=Double.parseDouble(str);
			long l=Long.parseLong(str);
			System.out.println(b);
			System.out.println(s);
			System.out.println(a);
			System.out.println(f);
			System.out.println(d);
			System.out.println(l);
			sc.close();	
		}
	}

