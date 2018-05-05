package main;

public class NewReleasePrice extends Price
{
	@Override
	PriceCategory getPriceCode()
	{
		return PriceCategory.NEW_RELEASE;
	}

	@Override
	int getFrequentRenterPoints(int daysRented)
	{
		return (daysRented > 1) ? 2 : 1;
	}
}
