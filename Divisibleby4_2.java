package dailytask;

public class Divisibleby4_2 {

	public static void main(String[] args) {
		for(int i=100;i>=50;i--)
		{
			if((i%4==0)&&(i%2==0))
			{
				System.out.print(i+" ");
			}
		}
	}

}
