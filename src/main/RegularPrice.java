package main;

public class RegularPrice extends Price
{

	@Override
	PriceCategory getPriceCode()
	{
		return PriceCategory.REGULAR;
	}
}
