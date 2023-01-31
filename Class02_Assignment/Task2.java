import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of Sphere: ");
		double radius = input.nextDouble();
		
		double pi = 3.1416;
		
		double Volume = (4 * pi * Math.pow(radius,3)) / 3 ;
		
		System.out.println("\nThe Volume of the Sphere is "+Volume+" qubic unit");
	}

}
