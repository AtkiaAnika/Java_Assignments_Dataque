//prime number check using for loop
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//taking input from user
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		int count = 0;
		
		//logic
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			
			count++;
			
		}
		
		if(count == 0 && n != 1)
		{
			System.out.println(n+" is a Prime number.");
		}
		else
		{
			System.out.println(n+" is not a Prime number.");
		}
		
		input.close();
	}

}
