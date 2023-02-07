import  java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();

		if (n == 0)
		{
			System.out.println("ZERO!!");
		}
		
		else if (n % 2 == 0)
		{
			if (n > 0)
			{
				System.out.println(n+" is Even and Positive number.");
			}
			else
			{
				System.out.println(n+" is Even and Negative number.");
			}
		}
		
		else if (n % 2 != 0)
		{
			if (n > 0)
			{
				System.out.println(n+" is Odd and Positive number.");
			}
			else
			{
				System.out.println(n+" is Odd and Negative number.");
			}

		}
		else
		{
			System.out.println("INVALID !!");
		}
		
		input.close();
	}

}
