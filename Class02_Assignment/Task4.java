import java.util.Scanner;
public class Task4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your NSU ID: ");
		int ID = input.nextInt();
		
		System.out.println("Your current CGPA: ");
		double CGPA = input.nextDouble();
		
		System.out.println("Which department are you from ? ");
		String dept = input.next();
		
		System.out.println("\nName: "+name);
		System.out.println("NSU ID :"+ID);
		System.out.println("Current CGPA :"+CGPA);
		System.out.println("Department : "+dept);
		
		
	}

}
