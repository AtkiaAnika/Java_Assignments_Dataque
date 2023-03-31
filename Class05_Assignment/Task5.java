import java.util.Scanner;

public class Task5 {
	static double balance = 0.0;
	public static void main(String[] args) 
	{
		
		 //Scanner class
		Scanner input = new Scanner(System.in);
		
		double i = 0; 
		double money = 0;
		int button;
		int ex = 0; 
		
		do {
			System.out.println("\n\n~~Enter a button from the Menu :");
			System.out.print("\t*Deposit = 1\n\t*Withdraw = 2\n\t*Balance = 3\n\t*Exit = 4\n");
			System.out.print("\nPress a Button: ");
			button = input.nextInt(); 
			
			if(button == 1)
			{
				System.out.print("Enter the deposit amount : ");
				money = input.nextDouble();
				i = deposit((money)); 
			}
			else if(button == 2) 
			{
				System.out.print("Enter the withdraw amount : ");
				money = input.nextDouble();
				
				if(money <= balance)
					
					i = withdraw((money)); 
				
				else 
				{
					
					System.out.println("\nSorry! This amount is exceeding the total balance limit");
				}
			}
			
			else if(button == 3) 
			{
				System.out.print("\n Current Balance : "+i);
			}
			
			else if(button == 4) 
			{
				ex++;
				break; 
			}
		}
		while(true); 

		
		System.out.println();
		
		if(ex > 0) 
		{
			System.out.println("~~Your Latest Balance is: "+i);
		}
		input.close();
	}
	
	public static double deposit(double amount) 
	{
		balance = balance + amount; //increasing the current balance
		
		return balance;
	}
	
	public static double withdraw(double amount) 
	{
		balance = balance - amount; //decreasing the current balance
		
		return balance;
	}

}