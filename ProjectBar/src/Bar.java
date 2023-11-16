import java.util.Scanner;
public class Bar {
	protected String drink;
	protected int numDrinks;
	protected int orderId;
	private static int numOrders = 0;
	
	
	public Bar()
	{
		drink = "NA";
		numDrinks = 0;
		orderId = numOrders;
		numOrders++;
		//hello
	}
	
	public Bar (Scanner scnr)
	{
		// this.drink = drink;
		// this.numDrinks = numDrinks;
		numOrders++;
		
		String[] drinksOffered = {"Beer", "Wine", "Liquor"};
		
		System.out.println("Enter desired drink: ");
		drink = scnr.nextLine();
		
		System.out.println("How many would you like: ");
		numDrinks = scnr.nextInt();
	
			//if (!scnr.equals(drinksOffered))
		//	{
			//	System.out.println("Option not available. Pick again");
			//}
		}
	
	
	public static int getNumOrders()
	{
		return numOrders;
	}
	
	public int getOrderId()
	{
		return orderId;
	}
	public String getDrink()
	{
		
		return drink;
	}
	
	public void setDrink(String drink)
	{
		this.drink = drink;
	}

	public int getNumDrinks()
	{
		return numDrinks;
	}
	
	public void setNumDrinks(int numDrinks)
	{
		this.numDrinks = numDrinks;
	}

	public void print()
	{
		System.out.println("Drink Ordered: " + drink);
		System.out.println("How many drinks would you like?: " + numDrinks);
		System.out.println("Number of orders: " + numOrders);
	}


	
}

