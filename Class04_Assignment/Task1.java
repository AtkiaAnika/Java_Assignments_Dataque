import java.util.Scanner;
public class Task1 {
	public static void main (String[] args)
	{
		//scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = input.nextInt();
		
		int multiplication ;
		
		System.out.println("Multiplication table of "+n+" is : \n");
		for(int i=1; i<=10;i++)
		{
			multiplication = n * i;
			
			System.out.println(n+" X "+i+" = "+multiplication);
		}
		
		input.close();
		
	}

}
