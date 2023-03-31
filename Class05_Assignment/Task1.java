import java.util.Scanner;
public class Task1 {
public static void main(String []args)
{
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter n : ");
	int num = input.nextInt();
	
	for(int i=2; i<=num; i++)
	{
		if (isPerfectnumber(i) == 1)
		{
			System.out.println(i+" ");
		}
		
	}
	input.close();
}

public static int isPerfectnumber(int n)
{
	//sum of the divisors
	int sum = 0;
	for(int i=0; i<n; i++)
	{
		if(n%i == 0)
		{
			sum = sum + i;
		}
	}
	
	//System.out.println("Sum of the divisor is : "+sum);

    if (sum == n)
    
    	return 1;
    
    else
    	return 0;
}
}
