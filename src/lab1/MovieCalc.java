	package lab1;

	import java.util.Scanner; 

	public class MovieCalc {
		public static void main (String[] args){
		// Create Scanner object
		// Ask the user how many adult tickets were sold
		// Ask the user how many child tickets were sold
		// Ask the user for the price per adult ticket
		// Ask the user for the price per child ticket
		// Ask the user what percentage is paid to the movie company

	// Create a Scanner object
		Scanner in = new Scanner(System.in); 
		
	// Ask the user how many adult tickets were sold
		System.out.println("How many adult tickets were sold?");
		double adultSold = in.nextDouble();
	// Ask the user how many child tickets were sold
		System.out.println("How many child tickets were sold?");
		double childSold = in.nextDouble();
	// Ask the user for the price per adult ticket
		System.out.println("price per adult ticket");
		double adultPrice = in.nextDouble();
	// Ask the user for the price per child ticket
		System.out.println("What was the price per child ticket?");
		double childPrice = in.nextDouble();
	// Ask the user for the percentage paid to the movie company
		System.out.println("What percentage is paid to the movie company?");
		double percentage = in.nextDouble(); 
		
	// results
		double gadultRevenue = (adultSold * adultPrice);
		double padultRevenue = (gadultRevenue * percentage);
		double nadultRevenue = (gadultRevenue - padultRevenue);
		
		double gchildRevenue = (childSold * childPrice);
		double pchildRevenue = (gchildRevenue * percentage);
		double nchildRevenue = (gchildRevenue - pchildRevenue);
		
		double totalGross = (gchildRevenue + gadultRevenue); 
		double totalNet = (nchildRevenue + nadultRevenue); 
		

		System.out.println(gadultRevenue); 
		System.out.println(nadultRevenue); 
		System.out.println(gchildRevenue);
		System.out.println(nchildRevenue);
		System.out.println(totalGross); 
		System.out.println(totalNet); 
		
		
		}

	}

