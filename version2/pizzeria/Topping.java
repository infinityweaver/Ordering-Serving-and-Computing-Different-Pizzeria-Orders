package pizzeria;

public class Topping 
{
	private String name;
	private double cost;

	public Topping(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}

	public String getName()
	{
		return this.name;
	}

	public double getCost()
	{
		return this.cost;
	}
}