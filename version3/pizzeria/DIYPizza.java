package pizzeria;
import java.util.*;

public class DIYPizza extends Pizza implements PricedItem
{
	public DIYPizza(PizzaSize size)
	{
		super("DIY Pizza", size, PizzaBase.Original);
	}

    @Override
    public double computePrice()
    {
        double price = 100;
            
        ArrayList<Topping> toppings = super.getToppings();
        
        for (Topping top : toppings)
        {
            price += top.getCost();
        }
        
        if(null != super.getSize())
        {
            switch (super.getSize()) 
            {
                case Single -> price *= 1;
                case Double -> price *= 2;
                case Barkada -> price *= 3;
                default -> {}
            }
        }
                        
        return price;
    }
}