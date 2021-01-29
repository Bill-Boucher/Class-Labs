
public class Week1Labs {

	public static void main(String[] args) {
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 9;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 42.18;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'L';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name 
		String customerFirstName = "Joe";
		
		//create a variable to hold a street address
		
		String streetAddress = "1234 E Downing";
		
		//print all variables to the console
		
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price of groceries.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println(isHotOutside);
		System.out.println("The customer's first name is, " + customerFirstName);
		System.out.println(streetAddress + " is where the restaurant is located.");
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats -=4;
		
		System.out.println(availablePlaneSeats);
		

		//Impulse candy bar purchase, add 2.15 to grocery total
		costOfGroceries += 2.15;
		
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'A';
		
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		
		isHotOutside = !isHotOutside;
				
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial and last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Jones";
		
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address available
		
		System.out.println("Hello my name is, " + fullName + " and I live at " + streetAddress);
	}

}
