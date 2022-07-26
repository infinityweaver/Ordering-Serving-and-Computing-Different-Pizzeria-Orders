package pizzeria;

import java.util.*;

public class DIYPizza extends Pizza
{
	public DIYPizza(PizzaSize size)
	{
		super("DIY Pizza", size, PizzaBase.Original);
	}

	@Override
	public double computePrice()
	{
		double total = 0;

		ArrayList<Topping> toppings = super.getToppings();

		for(Topping t : toppings)
			total += t.getCost();

		total += 100;

		switch(super.getSize())
		{
			case Double: total *= 2;
				break;
			case Barkada: total *= 5;
				break;
		}

		return total;
	}
}