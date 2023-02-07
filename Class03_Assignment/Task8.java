import java.util.Scanner;
public class Task8 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter 1st number: ");
		int n1 = input.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int n2 = input.nextInt();
		
		System.out.println("Enter operator (+, -, *, /): ");
		char operator = input.next().charAt(0);
		
		int summation = n1 + n2; 
		int subtraction = n1 - n2;
		int multiplication = n1 * n2;
		double division = n1 / n2;
		
		switch(operator)
		{
		case '+':
			System.out.println(n1+" + "+n2+" = "+summation);
			break;
		case '-':
			System.out.println(n1+" - "+n2+" = "+subtraction);
			break;
		case '*':
			System.out.println(n1+" * "+n2+" = "+multiplication);
			break;
		case '/':
			System.out.println(n1+" / "+n2+" = "+division);
			break;
		default:
				System.out.println("Invalid sign");
		}
		input.close();
	}
}
