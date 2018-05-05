package main;

public abstract class Price
{
	abstract PriceCategory getPriceCode();

	double getCharge(int daysRented)
	{
		return PriceCategory.getCharge(getPriceCode(), daysRented);
	}

	int getFrequentRenterPoints(int daysRented)
	{
		return 1;
	}
}
