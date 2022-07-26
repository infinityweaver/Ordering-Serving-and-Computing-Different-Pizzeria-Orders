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

		for(Fruit f : this.fruits)
			total += f.getCost();

		total += 40;

		switch(this.size)
		{
			case Medium: total *= 1.45;
				break;
			case Large: total *= 1.85;
				break;
		}

		return total;
	}
}