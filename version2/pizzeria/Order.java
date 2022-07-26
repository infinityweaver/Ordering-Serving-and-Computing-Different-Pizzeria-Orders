package pizzeria;
import java.util.*;

public class Order
{
	private ArrayList<Pizza> pizzas;

	public Order()
	{
		this.pizzas = new ArrayList<Pizza>();
	}

	public void addPizza(Pizza pizza)
	{
		this.pizzas.add(pizza);
	}

	public int getNumOfPizzas()
	{
		return this.pizzas.size();
	}

	public Pizza getPizza(int index)
	{
		return this.pizzas.get(index);
	}
}