import java.util.Scanner;
public class Task6 {
public static void main(String []args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	int n = input.nextInt();
	 int cube ;
	 
	 cube =  (int)(Math.pow(n,3));
	 
	 System.out.print(n+"^3 = "+cube);
	 
	 input.close();
}
}
