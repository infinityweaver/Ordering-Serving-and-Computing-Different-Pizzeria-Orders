package pizzeria;
import java.util.*;

public class FruitShake implements PricedItem
{
	private ShakeSize size;

	private ArrayList<Fruit> fruits;

	public FruitShake(ShakeSize size)
	{
		this.size = size;
		this.fruits = new ArrayList<Fruit>();
	}

	public void addFruit(Fruit fruit)
	{
		this.fruits.add(fruit);
	}

	public ArrayList<Fruit> getFruits()
	{
		return new ArrayList<Fruit>(this.fruits);
	}

	public ShakeSize getSize()
	{
		return this.size;
	}

	@Override
	public double computePrice()
	{
		double totalCost = 0;

		for(Fruit t : fruits)
			totalCost += t.getCost();

		totalCost += 40;
		switch (this.getSize())
		{
			case Medium: totalCost *= 1.45; 
						break;
			case Large: totalCost *= 1.85; 
						break;

		}
		return totalCost;
	}
}