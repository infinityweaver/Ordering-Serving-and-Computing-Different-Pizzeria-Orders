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
		double total = 0;

		for(Fruit fruity : this.fruits)
		{
			total = total + fruity.getCost();
		}

		total = total + 40;

		switch(this.size)
		{
			case Small:
				total = total * 1;
				break;
			case Medium:
				total = total * 1.45;
				break;
			case Large:
				total = total * 1.85;
				break;

		}

		return total;
	}
}