import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the value of Base: ");
	double base = input.nextDouble();
	
	System.out.println("Enter the value of Height: ");
	double height = input.nextDouble();
	
	double Area = 0.5 * base * height ;
	
	System.out.println("The Area of the Triangle is "+Area+" square unit.");
	
	
}

}
