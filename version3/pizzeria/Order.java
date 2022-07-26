package pizzeria;
import java.util.*;

public class Order
{
	private ArrayList<PricedItem> pricedItems;

	public Order()
	{
		this.pricedItems = new ArrayList<PricedItem>();
	}

	public void addPricedItem(PricedItem pricedItems)
	{
		this.pricedItems.add(pricedItems);
	}

	public int getNumOfPricedItems()
	{
		return this.pricedItems.size();
	}

	public PricedItem getPricedItem(int index)
	{
		return this.pricedItems.get(index);
	}

	public double computeTotalPayment()
	{
		double total = 0;

		for(PricedItem p : pricedItems)
			total += p.computePrice();

		return total;
	}
}