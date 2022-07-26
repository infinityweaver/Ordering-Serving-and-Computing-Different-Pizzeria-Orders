package pizzeria;
import java.util.*;

public class PizzaBaseRestaurant
{
	public ArrayList<Order> orders;
	public ArrayList<String> customers;

	public PizzaBaseRestaurant()
	{
		this.orders = new ArrayList<Order>();
		this.customers = new ArrayList<String>();
	}

	public void addOrder(String customer, Order order)
	{
		this.customers.add(customer);
		this.orders.add(order);
	}

	public int getTotalNumberOfCustomers()
	{
		return this.customers.size();
	}

	public Order getOrder(int index)
	{
		return this.orders.get(index);
	}

	public String getCustomer(int index)
	{
		return this.customers.get(index);
	}
}