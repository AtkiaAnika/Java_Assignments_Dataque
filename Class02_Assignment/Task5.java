import java.util.Scanner;

public class Task5 {
	
   public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Enter the value of 1st side: ");
	   double x = input.nextDouble();
	   
	   System.out.println("Enter the value of 2nd side: ");
	   double y = input.nextDouble();
	   
	   System.out.println("Enter the value of 3rd side: ");
	   double z = input.nextDouble();
	   
	   double s = (x + y + z) / 0.5;
	   
	   double Area = Math.sqrt(s*(s - x) * (s - y) * (s - z));   
	   
	   System.out.println("\nArea of the Triangle is: "+Area+" unit square.");
   }

}
