
import java.util.Scanner;
public class Task9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n : ");
		int n = input.nextInt();
		
		int sum = 0;
		int one = 1;
		
		for(int i=1; i<=n; i++)
		{
			//to print series
			System.out.print(one);
			if(i<n)
			{
				System.out.print(" + ");
			}
			sum = sum+one;
			one = (one*10)+1;
		}
		
		System.out.println();
		System.out.println("Sum : "+sum);
		input.close();
	}

}