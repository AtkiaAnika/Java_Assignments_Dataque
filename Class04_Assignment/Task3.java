import java.util.Scanner;
public class Task3 {
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		System.out.print("Divisors of "+n+" are : ");	
		for(int i=1; i<n; i++)
		{
			if(n%i == 0)
		
			System.out.print(i+" ");	
		}
		
		input.close();
	}

}
