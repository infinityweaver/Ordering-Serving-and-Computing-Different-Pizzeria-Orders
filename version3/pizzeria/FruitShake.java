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
		double price = 40;
        
        for (Fruit frt : this.fruits)
        {
            price += frt.getCost();
        }
        
        if(null != this.size)
        {
            switch (this.size) 
            {
                case Small -> price *= 1;
                case Medium -> price *= 1.45;
                case Large -> price *= 1.85;
                default -> {}
            }
        }
                        
        return price;
	}
}