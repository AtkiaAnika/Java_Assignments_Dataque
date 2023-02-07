import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the value of a: ");
		double a = input.nextDouble();
		
		System.out.println("Enter the value of b: ");
		double b = input.nextDouble();
		
		System.out.println("Enter the value of c: ");
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b,2) - 4 * a * c ;
		
		if (discriminant > 0)
		{
			System.out.println("Two Roots.");
		}
		else if (discriminant == 0)
		{
			System.out.println("One Root.");
		}
		else
		{
			System.out.println("The equation has no real roots.");
		}
		
		input.close();
	}

}
