package main;

public abstract class Price
{
	abstract PriceCategory getPriceCode();

	abstract double getCharge(int daysRented);

	int getFrequentRenterPoints(int daysRented)
	{
		return 1;
	}
}
