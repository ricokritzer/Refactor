package main;

public class RegularPrice extends Price
{

	@Override
	PriceCategory getPriceCode()
	{
		return PriceCategory.REGULAR;
	}

	double getCharge(int daysRented)
	{
		double result = 2;
		if (daysRented > 2)
		{
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}
}
