import java.util.*;
public class Order2 {
		
	private HashMap <Integer, Bar> orders;
	
	public Order2()
	{
		orders = new HashMap <Integer, Bar>();
	}
	
	public HashMap <Integer, Bar> getOrders()
	{
		return orders;
	}
	
	public void addOrder (String drink, int numDrinks)
	{
		Bar newOrder = new Bar();
		if (!newOrder.getDrink().equals("NA")) {
			orders.put(newOrder.getOrderId(), newOrder);
		}
	}
	
	
	
}
