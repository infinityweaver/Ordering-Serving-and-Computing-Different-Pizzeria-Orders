package pizzeria;

public class Fruit
{
	private String name;
	private double cost;

	public Fruit(String name, double cost)
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