import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer number :");
		int n = input.nextInt();
		
		switch(n%2)
		{
		case 0:
			System.out.println(n+" is an Even number.");
			break;
		case 1:
			System.out.println(n+" is an Odd number");
			break;
		}
		input.close();
	}
	} 
