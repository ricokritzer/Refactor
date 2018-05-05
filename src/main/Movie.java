package main;

public class Movie
{
	private String title;
	private PriceCategory category;

	public Movie(String title, PriceCategory category)
	{
		this.title = title;
		this.category = category;
	}

	public PriceCategory getPriceCode()
	{
		return category;
	}

	public String getTitle()
	{
		return title;
	}

	double getCharge(int daysRented)
	{
		return PriceCategory.getCharge(category, daysRented);
	}

	public int getFrequentRenterPoints(int daysRented)
	{
		return PriceCategory.getFrequentRenterPoints(category, daysRented);
	}

}