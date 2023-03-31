import java.util.Scanner;
public class Task2 {
public static void main (String []args)
{
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number of five integers: ");
	int n = input.nextInt();
	
	System.out.println("Sum of the digit is : "+Sum(n));

	input.close();
}

public static int Sum(int num)
{
	int reminder;
	int sum = 0;
	while(num > 0)
	{
		reminder = num % 10;
		sum = sum + reminder;
		num = num / 10;
	}
	return sum;
}
}
