import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of radius: ");
		double radius = input.nextDouble();
		
		double pi = 3.1416;
		
		double Area = pi * (radius * radius);
		double Perimeter = 2 * pi * radius;
		
		System.out.println("\nThe Area of the Circle is "+Area+" square unit.");
		System.out.println("The Perimete of the Circle is "+Perimeter+" unit");
	}

}
