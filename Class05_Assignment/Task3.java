import java.util.Scanner;
public class Task3{
	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = input.nextLine();
		
		if(isPalindrom(str))
		{
			System.out.println("The string is PALINDROME");
		}
		else
		{
			System.out.println("The string is not PALINDROME");
		}
		
		input.close();
	}
	
	public static boolean isPalindrom(String arg)
	{
		String reverse = " ";
		
		//getting reverse output
		for(int i=arg.length()-1; i>=0; i--)
		{
			reverse = reverse + arg.charAt(i);
			//System.out.println(reverse);
		}
		System.out.println("Reverse string is : "+reverse);
		
		//to check Palindrome
		boolean palindrome = true;
		for(int i=0; i<arg.length();i++)
		{
			if(arg.charAt(i) != reverse.charAt(i))
					palindrome = false ;
		}
		
		return palindrome;
		
	}
}