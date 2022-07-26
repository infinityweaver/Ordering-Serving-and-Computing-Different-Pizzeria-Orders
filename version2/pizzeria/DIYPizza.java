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
		double totalcost = 0;

		ArrayList<Topping> toppings = super.getToppings();

		for(Topping t : toppings)
			totalcost += t.getCost();

		totalcost += 100;

		switch(super.getSize())
		{
			case Double: totalcost *= 2;
				break;
			case Barkada: totalcost *= 5;
				break;
		}

		return totalcost;
	}
}