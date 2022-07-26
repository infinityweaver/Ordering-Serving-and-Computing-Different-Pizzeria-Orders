package pizzeria;
import java.util.*;

public class DIYPizza extends Pizza implements PricedItem
{
	public DIYPizza (PizzaSize size)
	{
		super("DIY Pizza",size,PizzaBase.Original);

	}

	@Override
	public double computePrice()
	{
		double totalCost = 0;

		ArrayList<Topping> toppings = super.getToppings();

		for(Topping t : toppings)
			totalCost += t.getCost();
			totalCost += 100;
			switch (super.getSize())
			{
				case Double: totalCost *= 2; 
							break;
				case Barkada: totalCost *= 5; 
							break;

			}
		return totalCost;
	}

}