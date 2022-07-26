package pizzeria;

public class PrefabPizza extends Pizza
{
	private double price;

	public PrefabPizza(String name, PizzaSize size, PizzaBase base, double price)
	{
		super(name,size,base);
		this.price = price;
	}

	@Override
	public double computePrice()
	{
		return price;
	}

}