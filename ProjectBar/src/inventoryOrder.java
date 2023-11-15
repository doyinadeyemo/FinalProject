import java.util.*;
public class inventoryOrder extends Bar {

private int numBottles;
	
	public inventoryOrder()
	{
		numBottles = numDrinks;
	}
	
	public int getNumBottles()
	{
		return numBottles;
	}
	
	public void setNumBottles (int numBottles)
	{
		this.numBottles = numBottles;
	}
	

	@Override
	public void print()
	{
		super.print();
		System.out.println("Number of Bottles used: " + numBottles);
	}
	

	
	
	
	
	
}
