
import java.util.Scanner;
public class Task10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter n : ");
		int n = input.nextInt();
		
	    double sum = 0;
	    
	    for(int i=1; i<=n; i++) {
	    	 
	    	//to print the series
	    	if(i==1)
	    	{
	    		System.out.print(i);
	    	}
	    	else
	    	{
	    		System.out.print("1/"+i+"^"+i);
	    	}
	    	if(i<n)
	    	{
	    		System.out.print("+");
	    	}
	    	
	    	sum = sum + 1/(double)i;
	    }
		System.out.println();
	    System.out.println("Sum : "+sum);
	    input.close();
	}

}
