import java.util.Scanner;
public class Task7 {
	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int digit = input.nextInt();
		
		int reminder = 0;
		int sum = 0;
		
		
		while(digit > 0)
		{
			reminder = digit % 10;
			sum = sum + reminder;
			digit = digit / 10;
		}
		
		System.out.print("Sum of the digits in is : "+sum);
		input.close();
	}

}
