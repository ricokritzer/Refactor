package main;

public class Price
{
	private PriceCategory category;

	public Price(PriceCategory category)
	{
		this.category = category;
	}

	double getCharge(int daysRented)
	{
		return PriceCategory.getCharge(category, daysRented);
	}

	int getFrequentRenterPoints(int daysRented)
	{
		return PriceCategory.getFrequentRenterPoints(category, daysRented);
	}
}
