import java.util.ArrayList;
public class Order1 {
	String [] drinksOptions = {"Beer", "Wine", "Liquor"};
	
	private ArrayList <Bar> orders;
		
	public Order1()
	{
		orders = new ArrayList <Bar>();
					
	}
		
	public ArrayList <Bar> getOrders()
	{
		return orders;
	}
		
	public void addOrder (String drink, int numDrinks)
	{
		Bar newOrder = new Bar ();
		orders.add(newOrder);
		if (!newOrder.getDrink().equals("NA"))
		{
			orders.add(newOrder);
		}
	}
	
	
	
}
