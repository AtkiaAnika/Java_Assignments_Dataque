import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*Price List* ");
		System.out.println("\nPer Book = 10$");
		System.out.println("Per Pen = 5$");
		System.out.println("Per bag = 20$");
		
		System.out.println("\nHow many book will you purchase ? ");
		int p = input.nextInt();
		
		System.out.println("How many pen will you purchase ? ");
		int q = input.nextInt();
		
		System.out.println("How many bag will you purchase ? ");
		int r = input.nextInt();
		
		int PriceOfBook = 10 * p ;
		int PriceOfPen = 5 * q ;
		int PriceOfBag = 20 * r ;
		
		System.out.println("\n");
		System.out.println("Total price of book: "+PriceOfBook+"$");
		System.out.println("Total price of pen: "+PriceOfPen+"$" );
		System.out.println("Total price of bag: "+PriceOfBag+"$");
		
		int totalCost = PriceOfBook + PriceOfPen + PriceOfBag ;
		
		System.out.println("\nYour total cost is: "+totalCost+"$");
	}

}
